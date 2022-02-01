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
public class LCS_FORMED_CONSECUTIVE_SEGMENTS_LEAST_LENGTH_K{
static int f_gold ( int k , String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  int lcs [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  int cnt [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= m ;
    j ++ ) {
      lcs [ i ] [ j ] = Math . max ( lcs [ i - 1 ] [ j ] , lcs [ i ] [ j - 1 ] ) ;
      if ( s1 . charAt ( i - 1 ) == s2 . charAt ( j - 1 ) ) cnt [ i ] [ j ] = cnt [ i - 1 ] [ j - 1 ] + 1 ;
      if ( cnt [ i ] [ j ] >= k ) {
        for ( int a = k ;
        a <= cnt [ i ] [ j ] ;
        a ++ ) lcs [ i ] [ j ] = Math . max ( lcs [ i ] [ j ] , lcs [ i - a ] [ j - a ] + a ) ;
      }
    }
  }
  return lcs [ n ] [ m ] ;
}


//TOFILL

}
