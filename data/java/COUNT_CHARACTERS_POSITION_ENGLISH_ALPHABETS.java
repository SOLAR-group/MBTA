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
public class COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS{
static int f_gold ( String str ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( i == ( str . charAt ( i ) - 'a' ) || i == ( str . charAt ( i ) - 'A' ) ) {
      result ++ ;
    }
  }
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("lLkhFeZGcb");
    param0.add("ABcED");
    param0.add("geeksforgeeks");
    param0.add("Alphabetical");
    param0.add("abababab");
    param0.add("bcdefgxyz");
    param0.add("cBzaqx L");
    param0.add(" bcd");
    param0.add("11");
    param0.add("MqqKY");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
