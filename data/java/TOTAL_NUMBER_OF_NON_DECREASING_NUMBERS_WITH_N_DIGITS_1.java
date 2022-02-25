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
public class TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1{
static long f_gold ( int n ) {
  int N = 10 ;
  long count = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    count *= ( N + i - 1 ) ;
    count /= i ;
  }
  return count ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(11);
    param0.add(94);
    param0.add(73);
    param0.add(6);
    param0.add(73);
    param0.add(58);
    param0.add(40);
    param0.add(64);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("TOTAL_NUMBER_OF_NON_DECREASING_NUMBERS_WITH_N_DIGITS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
