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
public class MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING_1{
static char f_gold ( String str ) {
  int n = str . length ( ) ;
  int count = 0 ;
  char res = str . charAt ( 0 ) ;
  int cur_count = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i < n - 1 && str . charAt ( i ) == str . charAt ( i + 1 ) ) cur_count ++ ;
    else {
      if ( cur_count > count ) {
        count = cur_count ;
        res = str . charAt ( i ) ;
      }
      cur_count = 1 ;
    }
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("geeekk");
    param0.add("3786868");
    param0.add("110");
    param0.add("aaaabbcbbb");
    param0.add("11");
    param0.add("011101");
    param0.add("WoHNyJYLC");
    param0.add("3141711779");
    param0.add("10111101101");
    param0.add("aabbabababcc");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
