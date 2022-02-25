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
public class NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1{
static int f_gold ( int n ) {
  return ( ( n + 1 ) * ( n + 2 ) ) / 2 ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(41);
    param0.add(72);
    param0.add(54);
    param0.add(75);
    param0.add(87);
    param0.add(41);
    param0.add(78);
    param0.add(80);
    param0.add(46);
    param0.add(9);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
