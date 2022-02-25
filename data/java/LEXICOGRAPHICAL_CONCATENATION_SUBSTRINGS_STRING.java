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
public class LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING{
static String f_gold ( String s ) {
  int n = s . length ( ) ;
  int sub_count = n * ( n + 1 ) / 2 ;
  String [ ] arr = new String [ sub_count ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int len = 1 ;
  len <= n - i ;
  len ++ ) {
    arr [ index ++ ] = s . substring ( i , i + len ) ;
  }
  Arrays . sort ( arr ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < sub_count ;
  i ++ ) res += arr [ i ] ;
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("sqGOi");
    param0.add("848580");
    param0.add("01001110011001");
    param0.add("ZhWXUKmeiI");
    param0.add("0917296541285");
    param0.add("01101001111100");
    param0.add("tjP kR");
    param0.add("999907");
    param0.add("011100");
    param0.add("qJPHNSJOUj");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
