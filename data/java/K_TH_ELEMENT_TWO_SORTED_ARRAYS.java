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
public class K_TH_ELEMENT_TWO_SORTED_ARRAYS{
static int f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n , int k ) {
  int [ ] sorted1 = new int [ m + n ] ;
  int i = 0 , j = 0 , d = 0 ;
  while ( i < m && j < n ) {
    if ( arr1 [ i ] < arr2 [ j ] ) sorted1 [ d ++ ] = arr1 [ i ++ ] ;
    else sorted1 [ d ++ ] = arr2 [ j ++ ] ;
  }
  while ( i < m ) sorted1 [ d ++ ] = arr1 [ i ++ ] ;
  while ( j < n ) sorted1 [ d ++ ] = arr2 [ j ++ ] ;
  return sorted1 [ k - 1 ] ;
}


//TOFILL

}
