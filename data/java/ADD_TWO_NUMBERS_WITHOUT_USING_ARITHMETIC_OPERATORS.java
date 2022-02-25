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
public class ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS{
static int f_gold ( int x , int y ) {
  while ( y != 0 ) {
    int carry = x & y ;
    x = x ^ y ;
    y = carry << 1 ;
  }
  return x ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(17);
    param0.add(73);
    param0.add(75);
    param0.add(27);
    param0.add(61);
    param0.add(65);
    param0.add(22);
    param0.add(61);
    param0.add(97);
    List<Integer> param1 = new ArrayList<>();
    param1.add(60);
    param1.add(44);
    param1.add(96);
    param1.add(3);
    param1.add(54);
    param1.add(1);
    param1.add(63);
    param1.add(19);
    param1.add(9);
    param1.add(23);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("ADD_TWO_NUMBERS_WITHOUT_USING_ARITHMETIC_OPERATORS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
