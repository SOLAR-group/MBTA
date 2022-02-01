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
public class COUNT_SUBARRAYS_EQUAL_NUMBER_1S_0S_1{
static int f_gold ( int [ ] arr , int n ) {
  Map < Integer , Integer > myMap = new HashMap < > ( ) ;
  int sum = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 0 ) arr [ i ] = - 1 ;
    sum += arr [ i ] ;
    if ( sum == 0 ) count ++ ;
    if ( myMap . containsKey ( sum ) ) count += myMap . get ( sum ) ;
    if ( ! myMap . containsKey ( sum ) ) myMap . put ( sum , 1 ) ;
    else myMap . put ( sum , myMap . get ( sum ) + 1 ) ;
  }
  return count ;
}


//TOFILL

}
