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
public class MOBILE_NUMERIC_KEYPAD_PROBLEM{
static int f_gold ( char keypad [ ] [ ] , int n ) {
  if ( keypad == null || n <= 0 ) return 0 ;
  if ( n == 1 ) return 10 ;
  int [ ] odd = new int [ 10 ] ;
  int [ ] even = new int [ 10 ] ;
  int i = 0 , j = 0 , useOdd = 0 , totalCount = 0 ;
  for ( i = 0 ;
  i <= 9 ;
  i ++ ) odd [ i ] = 1 ;
  for ( j = 2 ;
  j <= n ;
  j ++ ) {
    useOdd = 1 - useOdd ;
    if ( useOdd == 1 ) {
      even [ 0 ] = odd [ 0 ] + odd [ 8 ] ;
      even [ 1 ] = odd [ 1 ] + odd [ 2 ] + odd [ 4 ] ;
      even [ 2 ] = odd [ 2 ] + odd [ 1 ] + odd [ 3 ] + odd [ 5 ] ;
      even [ 3 ] = odd [ 3 ] + odd [ 2 ] + odd [ 6 ] ;
      even [ 4 ] = odd [ 4 ] + odd [ 1 ] + odd [ 5 ] + odd [ 7 ] ;
      even [ 5 ] = odd [ 5 ] + odd [ 2 ] + odd [ 4 ] + odd [ 8 ] + odd [ 6 ] ;
      even [ 6 ] = odd [ 6 ] + odd [ 3 ] + odd [ 5 ] + odd [ 9 ] ;
      even [ 7 ] = odd [ 7 ] + odd [ 4 ] + odd [ 8 ] ;
      even [ 8 ] = odd [ 8 ] + odd [ 0 ] + odd [ 5 ] + odd [ 7 ] + odd [ 9 ] ;
      even [ 9 ] = odd [ 9 ] + odd [ 6 ] + odd [ 8 ] ;
    }
    else {
      odd [ 0 ] = even [ 0 ] + even [ 8 ] ;
      odd [ 1 ] = even [ 1 ] + even [ 2 ] + even [ 4 ] ;
      odd [ 2 ] = even [ 2 ] + even [ 1 ] + even [ 3 ] + even [ 5 ] ;
      odd [ 3 ] = even [ 3 ] + even [ 2 ] + even [ 6 ] ;
      odd [ 4 ] = even [ 4 ] + even [ 1 ] + even [ 5 ] + even [ 7 ] ;
      odd [ 5 ] = even [ 5 ] + even [ 2 ] + even [ 4 ] + even [ 8 ] + even [ 6 ] ;
      odd [ 6 ] = even [ 6 ] + even [ 3 ] + even [ 5 ] + even [ 9 ] ;
      odd [ 7 ] = even [ 7 ] + even [ 4 ] + even [ 8 ] ;
      odd [ 8 ] = even [ 8 ] + even [ 0 ] + even [ 5 ] + even [ 7 ] + even [ 9 ] ;
      odd [ 9 ] = even [ 9 ] + even [ 6 ] + even [ 8 ] ;
    }
  }
  totalCount = 0 ;
  if ( useOdd == 1 ) {
    for ( i = 0 ;
    i <= 9 ;
    i ++ ) totalCount += even [ i ] ;
  }
  else {
    for ( i = 0 ;
    i <= 9 ;
    i ++ ) totalCount += odd [ i ] ;
  }
  return totalCount ;
}


//TOFILL

}
