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
public class LONGEST_REPEATED_SUBSEQUENCE_1{
static String f_gold ( String str ) {
  int n = str . length ( ) ;
  int [ ] [ ] dp = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) for ( int j = 0 ;
  j <= n ;
  j ++ ) dp [ i ] [ j ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 1 ;
  j <= n ;
  j ++ ) if ( str . charAt ( i - 1 ) == str . charAt ( j - 1 ) && i != j ) dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ] ;
  else dp [ i ] [ j ] = Math . max ( dp [ i ] [ j - 1 ] , dp [ i - 1 ] [ j ] ) ;
  String res = "" ;
  int i = n , j = n ;
  while ( i > 0 && j > 0 ) {
    if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j - 1 ] + 1 ) {
      res = res + str . charAt ( i - 1 ) ;
      i -- ;
      j -- ;
    }
    else if ( dp [ i ] [ j ] == dp [ i - 1 ] [ j ] ) i -- ;
    else j -- ;
  }
  String reverse = "" ;
  for ( int k = res . length ( ) - 1 ;
  k >= 0 ;
  k -- ) {
    reverse = reverse + res . charAt ( k ) ;
  }
  return reverse ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<String> param0 = new ArrayList<>();
    param0.add("qnQxjoRx");
    param0.add("27473733400077");
    param0.add("000010111111");
    param0.add("TNVwgrWSLu");
    param0.add("9537");
    param0.add("1100");
    param0.add("lYcoiQfzN");
    param0.add("52");
    param0.add("00100001100");
    param0.add("Rkxe");
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("LONGEST_REPEATED_SUBSEQUENCE_1," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("LONGEST_REPEATED_SUBSEQUENCE_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
