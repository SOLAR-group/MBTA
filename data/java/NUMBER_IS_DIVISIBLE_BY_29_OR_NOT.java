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
public class NUMBER_IS_DIVISIBLE_BY_29_OR_NOT{
static boolean f_gold ( long n ) {
  while ( n / 100 > 0 ) {
    int last_digit = ( int ) n % 10 ;
    n /= 10 ;
    n += last_digit * 3 ;
  }
  return ( n % 29 == 0 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Long> param0 = new ArrayList<>();
    param0.add(29L);
param0.add(0L);
param0.add(65L);
param0.add(1419L);
param0.add(54L);
param0.add(7L);
param0.add(44L);
param0.add(34L);
param0.add(1160L);
param0.add(292929002929L);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_IS_DIVISIBLE_BY_29_OR_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
