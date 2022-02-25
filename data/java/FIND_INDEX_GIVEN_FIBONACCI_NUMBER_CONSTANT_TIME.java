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
public class FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME{
static int f_gold ( int n ) {
  if ( n <= 1 ) return n ;
  int a = 0 , b = 1 , c = 1 ;
  int res = 1 ;
  while ( c < n ) {
    c = a + b ;
    res ++ ;
    a = b ;
    b = c ;
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(5);
    param0.add(19);
    param0.add(7);
    param0.add(94);
    param0.add(58);
    param0.add(65);
    param0.add(69);
    param0.add(96);
    param0.add(80);
    param0.add(14);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
