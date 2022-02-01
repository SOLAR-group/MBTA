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
public class ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > s = new HashSet < > ( ) ;
  int count = 0 , maxm = Integer . MIN_VALUE , minm = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . add ( arr [ i ] ) ;
    if ( arr [ i ] < minm ) minm = arr [ i ] ;
    if ( arr [ i ] > maxm ) maxm = arr [ i ] ;
  }
  for ( int i = minm ;
  i <= maxm ;
  i ++ ) if ( ! s . contains ( i ) ) count ++ ;
  return count ;
}


//TOFILL

}
