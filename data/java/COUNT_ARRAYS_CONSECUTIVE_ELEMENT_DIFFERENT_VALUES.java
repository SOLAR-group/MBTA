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
public class COUNT_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES{
public static int f_gold ( int n , int k , int x ) {
  int [ ] dp = new int [ 109 ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) dp [ i ] = ( k - 2 ) * dp [ i - 1 ] + ( k - 1 ) * dp [ i - 2 ] ;
  return ( x == 1 ? ( k - 1 ) * dp [ n - 2 ] : dp [ n - 1 ] ) ;
}


//TOFILL

}
