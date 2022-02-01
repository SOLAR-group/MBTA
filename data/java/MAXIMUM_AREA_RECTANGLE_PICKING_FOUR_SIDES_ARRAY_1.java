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
public class MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  Set < Integer > s = new HashSet < > ( ) ;
  int first = 0 , second = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! s . contains ( arr [ i ] ) ) {
      s . add ( arr [ i ] ) ;
      continue ;
    }
    if ( arr [ i ] > first ) {
      second = first ;
      first = arr [ i ] ;
    }
    else if ( arr [ i ] > second ) second = arr [ i ] ;
  }
  return ( first * second ) ;
}


//TOFILL

}
