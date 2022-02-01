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

}
