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
public class FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT{
static boolean f_gold ( int n ) {
  return 1162261467 % n == 0 ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(3);
    param0.add(27);
    param0.add(9);
    param0.add(-9);
    param0.add(11);
    param0.add(57);
    param0.add(21);
    param0.add(60);
    param0.add(44);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_WHETHER_GIVEN_INTEGER_POWER_3_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
