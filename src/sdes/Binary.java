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
public class Binary {
    static String toBinary(int n){
        String out=Integer.toBinaryString(n);
        if(out.length()==1)
            out="0"+out;
        return out;
    }
    
    static int toDecimal(String n){
        return Integer.parseInt(n,2);
    }
}
