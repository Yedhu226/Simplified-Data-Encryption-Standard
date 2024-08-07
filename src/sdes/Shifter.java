package sdes;

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

/**
 *
 * @author yedhu226
 */
public class Shifter {
    static String LeftShift(String in, int n){
        String out="";
        for(int i=n;i<in.length();i++){
            out=out+in.charAt(i);
        }
        for(int i=0;i<in.length();i++){
            out=out+in.charAt(i);
        }
        return out;
    }
    
    static String XOR(String A, String B){
        String out="";
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(i))
                out=out+"0";
            else
                out=out+"1";
        }
        return out;
    }
}
