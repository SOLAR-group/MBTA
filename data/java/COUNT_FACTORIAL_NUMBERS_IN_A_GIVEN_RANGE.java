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
public class COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE{
static int f_gold ( int low , int high ) {
  int fact = 1 , x = 1 ;
  while ( fact < low ) {
    fact = fact * x ;
    x ++ ;
  }
  int res = 0 ;
  while ( fact <= high ) {
    res ++ ;
    fact = fact * x ;
    x ++ ;
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(57);
    param0.add(31);
    param0.add(62);
    param0.add(49);
    param0.add(82);
    param0.add(31);
    param0.add(5);
    param0.add(76);
    param0.add(55);
    List<Integer> param1 = new ArrayList<>();
    param1.add(79);
    param1.add(21);
    param1.add(37);
    param1.add(87);
    param1.add(98);
    param1.add(76);
    param1.add(45);
    param1.add(52);
    param1.add(43);
    param1.add(6);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_FACTORIAL_NUMBERS_IN_A_GIVEN_RANGE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
