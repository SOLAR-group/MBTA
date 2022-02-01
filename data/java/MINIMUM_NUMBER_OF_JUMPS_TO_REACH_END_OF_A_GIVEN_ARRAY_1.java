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
public class MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_1{
private static int f_gold ( int [ ] arr , int n ) {
  int jumps [ ] = new int [ n ] ;
  int i , j ;
  if ( n == 0 || arr [ 0 ] == 0 ) return Integer . MAX_VALUE ;
  jumps [ 0 ] = 0 ;
  for ( i = 1 ;
  i < n ;
  i ++ ) {
    jumps [ i ] = Integer . MAX_VALUE ;
    for ( j = 0 ;
    j < i ;
    j ++ ) {
      if ( i <= j + arr [ j ] && jumps [ j ] != Integer . MAX_VALUE ) {
        jumps [ i ] = Math . min ( jumps [ i ] , jumps [ j ] + 1 ) ;
        break ;
      }
    }
  }
  return jumps [ n - 1 ] ;
}


//TOFILL

}
