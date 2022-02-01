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
public class COUNT_PALINDROME_SUB_STRINGS_STRING{
static int f_gold ( char str [ ] , int n ) {
  int dp [ ] [ ] = new int [ n ] [ n ] ;
  boolean P [ ] [ ] = new boolean [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) P [ i ] [ i ] = true ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( str [ i ] == str [ i + 1 ] ) {
      P [ i ] [ i + 1 ] = true ;
      dp [ i ] [ i + 1 ] = 1 ;
    }
  }
  for ( int gap = 2 ;
  gap < n ;
  gap ++ ) {
    for ( int i = 0 ;
    i < n - gap ;
    i ++ ) {
      int j = gap + i ;
      if ( str [ i ] == str [ j ] && P [ i + 1 ] [ j - 1 ] ) P [ i ] [ j ] = true ;
      if ( P [ i ] [ j ] == true ) dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] + 1 - dp [ i + 1 ] [ j - 1 ] ;
      else dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i + 1 ] [ j ] - dp [ i + 1 ] [ j - 1 ] ;
    }
  }
  return dp [ 0 ] [ n - 1 ] ;
}


//TOFILL

}
