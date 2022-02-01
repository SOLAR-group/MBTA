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
public class COUNT_DISTINCT_OCCURRENCES_AS_A_SUBSEQUENCE{
static int f_gold ( String S , String T ) {
  int m = T . length ( ) ;
  int n = S . length ( ) ;
  if ( m > n ) return 0 ;
  int mat [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) mat [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) mat [ 0 ] [ j ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( T . charAt ( i - 1 ) != S . charAt ( j - 1 ) ) mat [ i ] [ j ] = mat [ i ] [ j - 1 ] ;
      else mat [ i ] [ j ] = mat [ i ] [ j - 1 ] + mat [ i - 1 ] [ j - 1 ] ;
    }
  }
  return mat [ m ] [ n ] ;
}


//TOFILL

}
