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
public class CHECK_REVERSING_SUB_ARRAY_MAKE_ARRAY_SORTED{
static boolean f_gold ( int arr [ ] , int n ) {
  int temp [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    temp [ i ] = arr [ i ] ;
  }
  Arrays . sort ( temp ) ;
  int front ;
  for ( front = 0 ;
  front < n ;
  front ++ ) {
    if ( temp [ front ] != arr [ front ] ) {
      break ;
    }
  }
  int back ;
  for ( back = n - 1 ;
  back >= 0 ;
  back -- ) {
    if ( temp [ back ] != arr [ back ] ) {
      break ;
    }
  }
  if ( front >= back ) {
    return true ;
  }
  do {
    front ++ ;
    if ( arr [ front - 1 ] < arr [ front ] ) {
      return false ;
    }
  }
  while ( front != back ) ;
  return true ;
}


//TOFILL

}
