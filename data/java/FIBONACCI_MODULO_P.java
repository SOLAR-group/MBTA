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
public class FIBONACCI_MODULO_P{
static int f_gold ( int p ) {
  int first = 1 , second = 1 , number = 2 , next = 1 ;
  while ( next > 0 ) {
    next = ( first + second ) % p ;
    first = second ;
    second = next ;
    number ++ ;
  }
  return number ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(51);
    param0.add(40);
    param0.add(68);
    param0.add(7);
    param0.add(8);
    param0.add(32);
    param0.add(93);
    param0.add(75);
    param0.add(71);
    param0.add(15);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIBONACCI_MODULO_P," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIBONACCI_MODULO_P," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
