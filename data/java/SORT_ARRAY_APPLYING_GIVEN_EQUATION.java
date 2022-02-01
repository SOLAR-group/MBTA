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
class SORT_ARRAY_APPLYING_GIVEN_EQUATION{
static void f_gold ( int arr [ ] , int n , int A , int B , int C ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = A * arr [ i ] * arr [ i ] + B * arr [ i ] + C ;
  int index = - 1 ;
  int maximum = - 999999 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( maximum < arr [ i ] ) {
      index = i ;
      maximum = arr [ i ] ;
    }
  }
  int i = 0 , j = n - 1 ;
  int [ ] new_arr = new int [ n ] ;
  int k = 0 ;
  while ( i < index && j > index ) {
    if ( arr [ i ] < arr [ j ] ) new_arr [ k ++ ] = arr [ i ++ ] ;
    else new_arr [ k ++ ] = arr [ j -- ] ;
  }
  while ( i < index ) new_arr [ k ++ ] = arr [ i ++ ] ;
  while ( j > index ) new_arr [ k ++ ] = arr [ j -- ] ;
  new_arr [ n - 1 ] = maximum ;
  for ( int p = 0 ;
  p < n ;
  p ++ ) arr [ p ] = new_arr [ p ] ;
}


//TOFILL

}
