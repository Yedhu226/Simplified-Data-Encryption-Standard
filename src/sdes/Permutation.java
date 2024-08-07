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

/**
 *
 * @author yedhu226
 */
public class Permutation {
    static int[] p_ten={3,5,2,7,4,10,1,9,8,6};
    static int[] p_eight={6,3,7,4,8,5,10,9};
    static int[] p_ip={2,6,3,1,4,8,5,7};
    static int[] p_ep={4,1,2,3,2,3,4,1};
    static int[] p_four={2,4,3,1};
    static int[] p_ip_inv={4,1,3,5,7,2,8,6};
    
    static String perm_10(String in){
        String out="";
        for(Integer i:p_ten){
            out=out+in.charAt(i-1);
        }
        return out;
    }
    
    static String perm_8(String in){
        String out="";
        for(Integer i:p_eight){
            out=out+in.charAt(i-1);
        }
        return out;
    }
    
    static String perm_ip(String in){
        String out="";
        for(Integer i:p_ip){
            out=out+in.charAt(i-1);
        }
        return out;
    }
    
    static String perm_ep(String in){
        String out="";
        for(Integer i:p_ep){
            out=out+in.charAt(i-1);
        }
        return out;
    }
    
    static String perm_4(String in){
        String out="";
        for(Integer i:p_four){
            out=out+in.charAt(i-1);
        }
        return out;
    }
    
    static String perm_ip_inv(String in){
        String out="";
        for(Integer i:p_ip_inv){
            out=out+in.charAt(i-1);
        }
        return out;
    }
}
