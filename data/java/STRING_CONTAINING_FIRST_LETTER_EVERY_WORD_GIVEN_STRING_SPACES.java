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
public class STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES{
static String f_gold ( String str ) {
  String result = "" ;
  boolean v = true ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == ' ' ) {
      v = true ;
    }
    else if ( str . charAt ( i ) != ' ' && v == true ) {
      result += ( str . charAt ( i ) ) ;
      v = false ;
    }
  }
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("t a");
    param0.add("77 78 2 600 7");
    param0.add("011 10 10");
    param0.add("kV Co O iR");
    param0.add("2");
    param0.add("0 11");
    param0.add("Y sT wgheC");
    param0.add("58 824 6");
    param0.add("00 100 001 0111");
    param0.add("Q");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
