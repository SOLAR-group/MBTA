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
public class COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW{
static int f_gold ( int a , int b ) {
  return ( a + b ) / 2 ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(1);
    param0.add(6);
    param0.add(75);
    param0.add(51);
    param0.add(19);
    param0.add(82);
    param0.add(72);
    param0.add(48);
    param0.add(12);
    param0.add(41);
    List<Integer> param1 = new ArrayList<>();
    param1.add(44);
    param1.add(61);
    param1.add(20);
    param1.add(17);
    param1.add(25);
    param1.add(98);
    param1.add(21);
    param1.add(41);
    param1.add(17);
    param1.add(80);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COMPUTE_AVERAGE_TWO_NUMBERS_WITHOUT_OVERFLOW," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
