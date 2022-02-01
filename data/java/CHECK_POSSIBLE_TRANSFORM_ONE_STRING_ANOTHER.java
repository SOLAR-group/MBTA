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
public class CHECK_POSSIBLE_TRANSFORM_ONE_STRING_ANOTHER{
static boolean f_gold ( String s1 , String s2 ) {
  int n = s1 . length ( ) ;
  int m = s2 . length ( ) ;
  boolean dp [ ] [ ] = new boolean [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      dp [ i ] [ j ] = false ;
    }
  }
  dp [ 0 ] [ 0 ] = true ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j <= s2 . length ( ) ;
    j ++ ) {
      if ( dp [ i ] [ j ] ) {
        if ( j < s2 . length ( ) && ( Character . toUpperCase ( s1 . charAt ( i ) ) == s2 . charAt ( j ) ) ) dp [ i + 1 ] [ j + 1 ] = true ;
        if ( ! Character . isUpperCase ( s1 . charAt ( i ) ) ) dp [ i + 1 ] [ j ] = true ;
      }
    }
  }
  return ( dp [ n ] [ m ] ) ;
}


//TOFILL

}
