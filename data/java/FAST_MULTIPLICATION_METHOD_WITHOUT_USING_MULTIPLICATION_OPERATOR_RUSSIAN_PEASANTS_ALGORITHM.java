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
public class FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM{
static int f_gold ( int a , int b ) {
  int res = 0 ;
  while ( b > 0 ) {
    if ( ( b & 1 ) != 0 ) res = res + a ;
    a = a << 1 ;
    b = b >> 1 ;
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(4);
    param0.add(36);
    param0.add(65);
    param0.add(55);
    param0.add(35);
    param0.add(69);
    param0.add(84);
    param0.add(5);
    param0.add(15);
    param0.add(67);
    List<Integer> param1 = new ArrayList<>();
    param1.add(33);
    param1.add(67);
    param1.add(52);
    param1.add(37);
    param1.add(76);
    param1.add(98);
    param1.add(62);
    param1.add(80);
    param1.add(36);
    param1.add(84);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
