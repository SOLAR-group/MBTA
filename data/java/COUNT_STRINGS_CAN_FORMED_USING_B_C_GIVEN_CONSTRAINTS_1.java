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
public class COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1{
static int f_gold ( int n ) {
  return 1 + ( n * 2 ) + ( n * ( ( n * n ) - 1 ) / 2 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(55);
    param0.add(36);
    param0.add(69);
    param0.add(92);
    param0.add(73);
    param0.add(16);
    param0.add(88);
    param0.add(19);
    param0.add(66);
    param0.add(68);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
