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
public class PAIR_WITH_GIVEN_PRODUCT_SET_1_FIND_IF_ANY_PAIR_EXISTS_1{
static boolean f_gold ( int arr [ ] , int n , int x ) {
  HashSet < Integer > hset = new HashSet < > ( ) ;
  if ( n < 2 ) return false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 0 ) {
      if ( x == 0 ) return true ;
      else continue ;
    }
    if ( x % arr [ i ] == 0 ) {
      if ( hset . contains ( x / arr [ i ] ) ) return true ;
      hset . add ( arr [ i ] ) ;
    }
  }
  return false ;
}


//TOFILL

}
