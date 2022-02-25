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
public class LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING{
static String f_gold ( String str ) {
  int n = str . length ( ) ;
  int LCSRe [ ] [ ] = new int [ n + 1 ] [ n + 1 ] ;
  String res = "" ;
  int res_length = 0 ;
  int i , index = 0 ;
  for ( i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j <= n ;
    j ++ ) {
      if ( str . charAt ( i - 1 ) == str . charAt ( j - 1 ) && LCSRe [ i - 1 ] [ j - 1 ] < ( j - i ) ) {
        LCSRe [ i ] [ j ] = LCSRe [ i - 1 ] [ j - 1 ] + 1 ;
        if ( LCSRe [ i ] [ j ] > res_length ) {
          res_length = LCSRe [ i ] [ j ] ;
          index = Math . max ( i , index ) ;
        }
      }
      else {
        LCSRe [ i ] [ j ] = 0 ;
      }
    }
  }
  if ( res_length > 0 ) {
    for ( i = index - res_length + 1 ;
    i <= index ;
    i ++ ) {
      res += str . charAt ( i - 1 ) ;
    }
  }
  return res ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("fbfHTjE");
    param0.add("09285256323");
    param0.add("0011000101110");
    param0.add("ue JkVZTt");
    param0.add("48387612426300");
    param0.add("010");
    param0.add("ddRrUz");
    param0.add("1049162633793");
    param0.add("100011");
    param0.add("iJfadiVaQqv");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_REPEATING_AND_NON_OVERLAPPING_SUBSTRING," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
