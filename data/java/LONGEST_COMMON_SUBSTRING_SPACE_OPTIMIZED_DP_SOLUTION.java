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
public class LONGEST_COMMON_SUBSTRING_SPACE_OPTIMIZED_DP_SOLUTION{
static int f_gold ( String X , String Y ) {
  int m = X . length ( ) ;
  int n = Y . length ( ) ;
  int result = 0 ;
  int [ ] [ ] len = new int [ 2 ] [ n ] ;
  int currRow = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) {
        len [ currRow ] [ j ] = 0 ;
      }
      else if ( X . charAt ( i - 1 ) == Y . charAt ( j - 1 ) ) {
        len [ currRow ] [ j ] = len [ ( 1 - currRow ) ] [ ( j - 1 ) ] + 1 ;
        result = Math . max ( result , len [ currRow ] [ j ] ) ;
      }
      else {
        len [ currRow ] [ j ] = 0 ;
      }
    }
    currRow = 1 - currRow ;
  }
  return result ;
}


//TOFILL

}
