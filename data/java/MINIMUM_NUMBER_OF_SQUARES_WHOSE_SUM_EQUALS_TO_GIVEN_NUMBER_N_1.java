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
public class MINIMUM_NUMBER_OF_SQUARES_WHOSE_SUM_EQUALS_TO_GIVEN_NUMBER_N_1{
static int f_gold ( int n ) {
  if ( n <= 3 ) return n ;
  int dp [ ] = new int [ n + 1 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  dp [ 2 ] = 2 ;
  dp [ 3 ] = 3 ;
  for ( int i = 4 ;
  i <= n ;
  i ++ ) {
    dp [ i ] = i ;
    for ( int x = 1 ;
    x <= Math . ceil ( Math . sqrt ( i ) ) ;
    x ++ ) {
      int temp = x * x ;
      if ( temp > i ) break ;
      else dp [ i ] = Math . min ( dp [ i ] , 1 + dp [ i - temp ] ) ;
    }
  }
  int res = dp [ n ] ;
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(16);
    param0.add(33);
    param0.add(47);
    param0.add(98);
    param0.add(36);
    param0.add(81);
    param0.add(55);
    param0.add(19);
    param0.add(4);
    param0.add(22);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_NUMBER_OF_SQUARES_WHOSE_SUM_EQUALS_TO_GIVEN_NUMBER_N_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_NUMBER_OF_SQUARES_WHOSE_SUM_EQUALS_TO_GIVEN_NUMBER_N_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
