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
public class FIND_NUMBER_TIMES_STRING_OCCURS_GIVEN_STRING_1{
static int f_gold ( String a , String b ) {
  int m = a . length ( ) ;
  int n = b . length ( ) ;
  int lookup [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  ++ i ) lookup [ 0 ] [ i ] = 0 ;
  for ( int i = 0 ;
  i <= m ;
  ++ i ) lookup [ i ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      if ( a . charAt ( i - 1 ) == b . charAt ( j - 1 ) ) lookup [ i ] [ j ] = lookup [ i - 1 ] [ j - 1 ] + lookup [ i - 1 ] [ j ] ;
      else lookup [ i ] [ j ] = lookup [ i - 1 ] [ j ] ;
    }
  }
  return lookup [ m ] [ n ] ;
}


//TOFILL

}
