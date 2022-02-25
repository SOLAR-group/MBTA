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
public class TAIL_RECURSION_FIBONACCI{
static int f_gold ( int n , int a , int b ) {
  if ( n == 0 ) return a ;
  if ( n == 1 ) return b ;
  return f_gold ( n - 1 , b , a + b ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(4);
    param0.add(60);
    param0.add(92);
    param0.add(73);
    param0.add(58);
    param0.add(82);
    param0.add(53);
    param0.add(57);
    param0.add(47);
    param0.add(83);
    List<Integer> param1 = new ArrayList<>();
    param1.add(43);
    param1.add(48);
    param1.add(21);
    param1.add(79);
    param1.add(38);
    param1.add(26);
    param1.add(10);
    param1.add(37);
    param1.add(91);
    param1.add(3);
    List<Integer> param2 = new ArrayList<>();
    param2.add(24);
    param2.add(98);
    param2.add(69);
    param2.add(38);
    param2.add(30);
    param2.add(12);
    param2.add(17);
    param2.add(26);
    param2.add(99);
    param2.add(64);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("TAIL_RECURSION_FIBONACCI," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("TAIL_RECURSION_FIBONACCI," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
