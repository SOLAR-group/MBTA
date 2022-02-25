import java.io.FileWriter;
import java.io.IOException;
// Copyright (c) 2019-present, Facebook, Inc.
// All rights reserved.
//
// This source code is licensed under the license found in the
// LICENSE file in the root directory of this source tree.
//

import java.util. *;
import java.util.stream.*;
import java.lang.*;
import javafx.util.Pair;
public class SQUARE_ROOT_OF_AN_INTEGER_1{
public static int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x ;
  int start = 1 , end = x , ans = 0 ;
  while ( start <= end ) {
    int mid = ( start + end ) / 2 ;
    if ( mid * mid == x ) return mid ;
    if ( mid * mid < x ) {
      start = mid + 1 ;
      ans = mid ;
    }
    else end = mid - 1 ;
  }
  return ans ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(10);
    param0.add(46);
    param0.add(54);
    param0.add(1);
    param0.add(67);
    param0.add(64);
    param0.add(10);
    param0.add(75);
    param0.add(11);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SQUARE_ROOT_OF_AN_INTEGER_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SQUARE_ROOT_OF_AN_INTEGER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
