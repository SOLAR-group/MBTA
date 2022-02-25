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
public class CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT{
static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  if ( n == 0 ) return false ;
  if ( n == 1 ) return ( ( str . charAt ( 0 ) - '0' ) % 4 == 0 ) ;
  int last = str . charAt ( n - 1 ) - '0' ;
  int second_last = str . charAt ( n - 2 ) - '0' ;
  return ( ( second_last * 10 + last ) % 4 == 0 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("PjAFZXQgN");
    param0.add("12325195609714");
    param0.add("00101111101");
    param0.add("xOtbXZiA");
    param0.add("980");
    param0.add("000000100");
    param0.add("zFacc W");
    param0.add("8");
    param0.add("110011");
    param0.add("afiutekeSfYrX");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
