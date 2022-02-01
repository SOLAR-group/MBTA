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
public class FIND_WHETHER_AN_ARRAY_IS_SUBSET_OF_ANOTHER_ARRAY_SET_1{
static boolean f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n ) {
  int i = 0 ;
  int j = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( j = 0 ;
    j < m ;
    j ++ ) if ( arr2 [ i ] == arr1 [ j ] ) break ;
    if ( j == m ) return false ;
  }
  return true ;
}


//TOFILL

}
