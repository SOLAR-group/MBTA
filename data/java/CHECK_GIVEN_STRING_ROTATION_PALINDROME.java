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
public class CHECK_GIVEN_STRING_ROTATION_PALINDROME{
static boolean f_gold ( String str ) {
  int l = 0 ;
  int h = str . length ( ) - 1 ;
  while ( h > l ) if ( str . charAt ( l ++ ) != str . charAt ( h -- ) ) return false ;
  return true ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("aadaa");
    param0.add("2674377254");
    param0.add("11");
    param0.add("0011000");
    param0.add("26382426486138");
    param0.add("111010111010");
    param0.add("abccba");
    param0.add("5191");
    param0.add("1110101101");
    param0.add("abcdecbe");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_GIVEN_STRING_ROTATION_PALINDROME," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_GIVEN_STRING_ROTATION_PALINDROME," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
