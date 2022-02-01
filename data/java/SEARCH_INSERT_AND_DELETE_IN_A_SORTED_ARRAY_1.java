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
public class SEARCH_INSERT_AND_DELETE_IN_A_SORTED_ARRAY_1{
static int f_gold ( int arr [ ] , int n , int key , int capacity ) {
  if ( n >= capacity ) return n ;
  int i ;
  for ( i = n - 1 ;
  ( i >= 0 && arr [ i ] > key ) ;
  i -- ) arr [ i + 1 ] = arr [ i ] ;
  arr [ i + 1 ] = key ;
  return ( n + 1 ) ;
}


//TOFILL

}
