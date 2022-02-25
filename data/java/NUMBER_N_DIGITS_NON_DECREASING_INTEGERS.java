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
public class NUMBER_N_DIGITS_NON_DECREASING_INTEGERS{
static int f_gold ( int n ) {
  int [ ] [ ] a = new int [ n + 1 ] [ 10 ] ;
  for ( int i = 0 ;
  i <= 9 ;
  i ++ ) a [ 0 ] [ i ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) a [ i ] [ 9 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 8 ;
  j >= 0 ;
  j -- ) a [ i ] [ j ] = a [ i - 1 ] [ j ] + a [ i ] [ j + 1 ] ;
  return a [ n ] [ 0 ] ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(2);
    param0.add(19);
    param0.add(79);
    param0.add(62);
    param0.add(93);
    param0.add(39);
    param0.add(7);
    param0.add(31);
    param0.add(3);
    param0.add(21);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_N_DIGITS_NON_DECREASING_INTEGERS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_N_DIGITS_NON_DECREASING_INTEGERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
