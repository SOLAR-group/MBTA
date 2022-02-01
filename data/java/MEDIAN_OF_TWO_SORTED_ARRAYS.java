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
public class MEDIAN_OF_TWO_SORTED_ARRAYS{
static int f_gold ( int ar1 [ ] , int ar2 [ ] , int n ) {
  int i = 0 ;
  int j = 0 ;
  int count ;
  int m1 = - 1 , m2 = - 1 ;
  for ( count = 0 ;
  count <= n ;
  count ++ ) {
    if ( i == n ) {
      m1 = m2 ;
      m2 = ar2 [ 0 ] ;
      break ;
    }
    else if ( j == n ) {
      m1 = m2 ;
      m2 = ar1 [ 0 ] ;
      break ;
    }
    if ( ar1 [ i ] < ar2 [ j ] ) {
      m1 = m2 ;
      m2 = ar1 [ i ] ;
      i ++ ;
    }
    else {
      m1 = m2 ;
      m2 = ar2 [ j ] ;
      j ++ ;
    }
  }
  return ( m1 + m2 ) / 2 ;
}


//TOFILL

}
