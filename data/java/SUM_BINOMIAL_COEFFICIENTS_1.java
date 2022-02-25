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
public class SUM_BINOMIAL_COEFFICIENTS_1{
static int f_gold ( int n ) {
  return ( 1 << n ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(48);
    param0.add(42);
    param0.add(15);
    param0.add(75);
    param0.add(23);
    param0.add(41);
    param0.add(46);
    param0.add(99);
    param0.add(36);
    param0.add(53);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_BINOMIAL_COEFFICIENTS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_BINOMIAL_COEFFICIENTS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
