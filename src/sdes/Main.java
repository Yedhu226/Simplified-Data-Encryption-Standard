/*
 * Copyright (C) 2024 yedhu226
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sdes;

import java.util.Scanner;
import static sdes.Binary.toBinary;
import static sdes.Binary.toDecimal;
import static sdes.KeyGeneration.generate;
import static sdes.Permutation.perm_4;
import static sdes.Permutation.perm_ep;
import static sdes.Permutation.perm_ip;
import static sdes.Permutation.perm_ip_inv;
import static sdes.Shifter.XOR;

/**
 *
 * @author yedhu226
 */
public class Main {
    
    static int[][] S0={{1,0,3,2},{3,2,1,0},{0,2,1,3},{3,1,3,2}};
    static int[][] S1={{0,1,2,3},{2,0,1,3},{3,0,1,0},{2,1,0,3}};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 8-bit Plaintext");
        String pt=sc.nextLine();
        System.out.println("Enter 10-bit key");
        String key=sc.nextLine();
        String cipher=encrypt(pt,key);
        System.out.println("The cipher is: "+cipher);
        System.out.println("The plaintext is: "+decrypt(cipher,key));
    }
    
    static String encrypt(String p,String k){
        String rk[]=generate(k);
        p=perm_ip(p);
        p=fk(p,rk[0]);
        swap(p);
        p=fk(p,rk[1]);
        p=perm_ip_inv(p);
        return p;
    }
    
    static String decrypt(String p,String k){
        String rk[]=generate(k);
        p=perm_ip(p);
        p=fk(p,rk[1]);
        swap(p);
        p=fk(p,rk[0]);
        p=perm_ip_inv(p);
        return p;
    }
    
    static String fk(String p,String k){
        String l,r,r1;
        l=p.substring(0, 4);
        r=p.substring(4);
        r1=p.substring(4);
        r=perm_ep(r);
        r=XOR(r,k);
        r=perm_4(substitute(r));
        l=XOR(l,r);
        p=l+r1;
        return p;
    }
    
    static String swap(String in){
        String l,r;
        l=in.substring(0, 4);
        r=in.substring(4);
        return r+l;
    }
    
    static String substitute(String in){
        String l,r;
        l=in.substring(0, 4);
        r=in.substring(4);
        String out="";
        String row,col;
        row=Character.toString(l.charAt(0))+ Character.toString(l.charAt(3));
        col=Character.toString(l.charAt(1))+ Character.toString(l.charAt(2));
        int ro,co;
        ro=toDecimal(row);
        co=toDecimal(col);
        out=toBinary(S0[ro][co]);
        row=Character.toString(r.charAt(0))+ Character.toString(r.charAt(3));
        col=Character.toString(r.charAt(1))+ Character.toString(r.charAt(2));
        ro=toDecimal(row);
        co=toDecimal(col);
        out=out+toBinary(S0[ro][co]);
        return out;
    }
}
