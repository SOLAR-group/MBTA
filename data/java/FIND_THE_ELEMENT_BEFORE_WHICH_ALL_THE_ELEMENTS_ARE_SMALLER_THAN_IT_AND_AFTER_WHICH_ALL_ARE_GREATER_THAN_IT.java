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
public class FIND_THE_ELEMENT_BEFORE_WHICH_ALL_THE_ELEMENTS_ARE_SMALLER_THAN_IT_AND_AFTER_WHICH_ALL_ARE_GREATER_THAN_IT{
static int f_gold ( int [ ] arr , int n ) {
  int [ ] leftMax = new int [ n ] ;
  leftMax [ 0 ] = Integer . MIN_VALUE ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) leftMax [ i ] = Math . max ( leftMax [ i - 1 ] , arr [ i - 1 ] ) ;
  int rightMin = Integer . MAX_VALUE ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( leftMax [ i ] < arr [ i ] && rightMin > arr [ i ] ) return i ;
    rightMin = Math . min ( rightMin , arr [ i ] ) ;
  }
  return - 1 ;
}


//TOFILL

}
