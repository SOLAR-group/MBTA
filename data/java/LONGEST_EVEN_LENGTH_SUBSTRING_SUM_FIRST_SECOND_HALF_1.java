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
public class LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int maxlen = 0 ;
  int sum [ ] [ ] = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum [ i ] [ i ] = str . charAt ( i ) - '0' ;
  for ( int len = 2 ;
  len <= n ;
  len ++ ) {
    for ( int i = 0 ;
    i < n - len + 1 ;
    i ++ ) {
      int j = i + len - 1 ;
      int k = len / 2 ;
      sum [ i ] [ j ] = sum [ i ] [ j - k ] + sum [ j - k + 1 ] [ j ] ;
      if ( len % 2 == 0 && sum [ i ] [ j - k ] == sum [ ( j - k + 1 ) ] [ j ] && len > maxlen ) maxlen = len ;
    }
  }
  return maxlen ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("jNkTf");
    param0.add("7");
    param0.add("100001101001");
    param0.add("fRXyQrTUjEk");
    param0.add("908404");
    param0.add("0101010010");
    param0.add("svq");
    param0.add("19");
    param0.add("11100010001");
    param0.add("O HgwJyOVfnV");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
