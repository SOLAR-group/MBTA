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
public class TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS{
static int f_gold ( int n ) {
  int dp [ ] [ ] = new int [ 10 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) dp [ i ] [ 1 ] = 1 ;
  for ( int digit = 0 ;
  digit <= 9 ;
  digit ++ ) {
    for ( int len = 2 ;
    len <= n ;
    len ++ ) {
      for ( int x = 0 ;
      x <= digit ;
      x ++ ) dp [ digit ] [ len ] += dp [ x ] [ len - 1 ] ;
    }
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) count += dp [ i ] [ n ] ;
  return count ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(21);
    param0.add(40);
    param0.add(83);
    param0.add(93);
    param0.add(43);
    param0.add(98);
    param0.add(35);
    param0.add(86);
    param0.add(76);
    param0.add(88);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
