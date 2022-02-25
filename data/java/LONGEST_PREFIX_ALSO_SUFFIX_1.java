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
public class LONGEST_PREFIX_ALSO_SUFFIX_1{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int lps [ ] = new int [ n ] ;
  lps [ 0 ] = 0 ;
  int len = 0 ;
  int i = 1 ;
  while ( i < n ) {
    if ( s . charAt ( i ) == s . charAt ( len ) ) {
      len ++ ;
      lps [ i ] = len ;
      i ++ ;
    }
    else {
      if ( len != 0 ) {
        len = lps [ len - 1 ] ;
      }
      else {
        lps [ i ] = 0 ;
        i ++ ;
      }
    }
  }
  int res = lps [ n - 1 ] ;
  return ( res > n / 2 ) ? n / 2 : res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("aabcdaabc");
    param0.add("1372494598");
    param0.add("110000100001");
    param0.add("abcab");
    param0.add("488938");
    param0.add("011010101011");
    param0.add("aaaa");
    param0.add("3356203205");
    param0.add("1010");
    param0.add("kkXiiTZkGeh");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_PREFIX_ALSO_SUFFIX_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_PREFIX_ALSO_SUFFIX_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
