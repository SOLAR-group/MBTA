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
public class PRINT_WORDS_STRING_REVERSE_ORDER{
static String f_gold ( String str ) {
  int i = str . length ( ) - 1 ;
  int start , end = i + 1 ;
  String result = "" ;
  while ( i >= 0 ) {
    if ( str . charAt ( i ) == ' ' ) {
      start = i + 1 ;
      while ( start != end ) result += str . charAt ( start ++ ) ;
      result += ' ' ;
      end = i ;
    }
    i -- ;
  }
  start = 0 ;
  while ( start != end ) result += str . charAt ( start ++ ) ;
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("m Dm YZ");
    param0.add("65 48 57 71");
    param0.add("01 010");
    param0.add("mT vhByi");
    param0.add("19 44 9 1");
    param0.add("0");
    param0.add("z vUi  ");
    param0.add("7 591 36643 9 055");
    param0.add("01");
    param0.add("ti YGaijPY");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PRINT_WORDS_STRING_REVERSE_ORDER," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PRINT_WORDS_STRING_REVERSE_ORDER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
