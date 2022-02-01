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
public class WAYS_TRANSFORMING_ONE_STRING_REMOVING_0_CHARACTERS{
static int f_gold ( String a , String b ) {
  int n = a . length ( ) , m = b . length ( ) ;
  if ( m == 0 ) {
    return 1 ;
  }
  int dp [ ] [ ] = new int [ m + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( i == 0 ) {
        if ( j == 0 ) {
          dp [ i ] [ j ] = ( a . charAt ( j ) == b . charAt ( i ) ) ? 1 : 0 ;
        }
        else if ( a . charAt ( j ) == b . charAt ( i ) ) {
          dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + 1 ;
        }
        else {
          dp [ i ] [ j ] = dp [ i ] [ j - 1 ] ;
        }
      }
      else if ( a . charAt ( j ) == b . charAt ( i ) ) {
        dp [ i ] [ j ] = dp [ i ] [ j - 1 ] + dp [ i - 1 ] [ j - 1 ] ;
      }
      else {
        dp [ i ] [ j ] = dp [ i ] [ j - 1 ] ;
      }
    }
  }
  return dp [ m - 1 ] [ n - 1 ] ;
}


//TOFILL

}
