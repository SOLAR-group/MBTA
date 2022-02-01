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
public class FIND_WHETHER_AN_ARRAY_IS_SUBSET_OF_ANOTHER_ARRAY_SET_1_1{
static boolean f_gold ( int arr1 [ ] , int arr2 [ ] , int m , int n ) {
  int i = 0 , j = 0 ;
  if ( m < n ) return false ;
  Arrays . sort ( arr1 ) ;
  Arrays . sort ( arr2 ) ;
  while ( i < n && j < m ) {
    if ( arr1 [ j ] < arr2 [ i ] ) j ++ ;
    else if ( arr1 [ j ] == arr2 [ i ] ) {
      j ++ ;
      i ++ ;
    }
    else if ( arr1 [ j ] > arr2 [ i ] ) return false ;
  }
  if ( i < n ) return false ;
  else return true ;
}


//TOFILL

}
