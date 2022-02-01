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
public class CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED_1{
static boolean f_gold ( int arr [ ] , int n ) {
  if ( n == 1 ) {
    return true ;
  }
  int i ;
  for ( i = 1 ;
  arr [ i - 1 ] < arr [ i ] && i < n ;
  i ++ ) ;
  if ( i == n ) {
    return true ;
  }
  int j = i ++ ;
  while ( arr [ j ] < arr [ j - 1 ] ) {
    if ( i > 1 && arr [ j ] < arr [ i - 2 ] ) {
      return false ;
    }
    j ++ ;
  }
  if ( j == n ) {
    return true ;
  }
  int k = j ;
  if ( arr [ k ] < arr [ i - 1 ] ) {
    return false ;
  }
  while ( k > 1 && k < n ) {
    if ( arr [ k ] < arr [ k - 1 ] ) {
      return false ;
    }
    k ++ ;
  }
  return true ;
}


//TOFILL

}
