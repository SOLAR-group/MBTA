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
public class PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES{
static int f_gold ( int n ) {
  return 1 + n * ( n + 1 ) / 2 ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(46);
    param0.add(68);
    param0.add(4);
    param0.add(12);
    param0.add(56);
    param0.add(14);
    param0.add(81);
    param0.add(29);
    param0.add(26);
    param0.add(40);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PIZZA_CUT_PROBLEM_CIRCLE_DIVISION_LINES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
