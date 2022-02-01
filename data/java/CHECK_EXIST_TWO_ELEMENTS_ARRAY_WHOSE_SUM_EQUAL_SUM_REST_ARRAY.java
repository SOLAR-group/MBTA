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
public class CHECK_EXIST_TWO_ELEMENTS_ARRAY_WHOSE_SUM_EQUAL_SUM_REST_ARRAY{
static boolean f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += arr [ i ] ;
  }
  if ( sum % 2 != 0 ) {
    return false ;
  }
  sum = sum / 2 ;
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int val = sum - arr [ i ] ;
    if ( s . contains ( val ) && val == ( int ) s . toArray ( ) [ s . size ( ) - 1 ] ) {
      System . out . printf ( "Pair elements are %d and %d\n" , arr [ i ] , val ) ;
      return true ;
    }
    s . add ( arr [ i ] ) ;
  }
  return false ;
}


//TOFILL

}
