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
public class NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK{
static int f_gold ( String s ) {
  int aCount = 0 ;
  int bCount = 0 ;
  int cCount = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'a' ) aCount = ( 1 + 2 * aCount ) ;
    else if ( s . charAt ( i ) == 'b' ) bCount = ( aCount + 2 * bCount ) ;
    else if ( s . charAt ( i ) == 'c' ) cCount = ( bCount + 2 * cCount ) ;
  }
  return cCount ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("");
    param0.add("abbc");
    param0.add("abcabc");
    param0.add("agsdbkfdc ");
    param0.add("ababab");
    param0.add("aaaaaaa");
    param0.add("aabaaabcc");
    param0.add("19");
    param0.add("1001100");
    param0.add("DtAnuQbU");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
