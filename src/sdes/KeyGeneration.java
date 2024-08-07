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

import static sdes.Permutation.perm_10;
import static sdes.Permutation.perm_8;
import static sdes.Shifter.LeftShift;

/**
 *
 * @author yedhu226
 */
public class KeyGeneration {
    public static String[] generate(String key){
        key=perm_10(key);
        String k[]=new String[2];
        String l,r;
        l=key.substring(0,5);
        r=key.substring(5);
        l=LeftShift(l,1);
        r=LeftShift(r,1);
        k[0]=l+r;
        k[0]=perm_8(k[0]);
        l=LeftShift(l,2);
        r=LeftShift(r,2);
        k[1]=l+r;
        k[1]=perm_8(k[1]);
        return k;
    }
}
