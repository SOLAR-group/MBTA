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
public class CHOCOLATE_DISTRIBUTION_PROBLEM{
static int f_gold ( int arr [ ] , int n , int m ) {
  if ( m == 0 || n == 0 ) return 0 ;
  Arrays . sort ( arr ) ;
  if ( n < m ) return - 1 ;
  int min_diff = Integer . MAX_VALUE ;
  int first = 0 , last = 0 ;
  for ( int i = 0 ;
  i + m - 1 < n ;
  i ++ ) {
    int diff = arr [ i + m - 1 ] - arr [ i ] ;
    if ( diff < min_diff ) {
      min_diff = diff ;
      first = i ;
      last = i + m - 1 ;
    }
  }
  return ( arr [ last ] - arr [ first ] ) ;
}


//TOFILL

}
