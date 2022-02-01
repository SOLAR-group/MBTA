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
public class MINIMUM_SUM_SUBSEQUENCE_LEAST_ONE_EVERY_FOUR_CONSECUTIVE_ELEMENTS_PICKED_1{
static int f_gold ( int ar [ ] , int n ) {
  if ( n <= 4 ) return Arrays . stream ( ar ) . min ( ) . getAsInt ( ) ;
  int [ ] sum = new int [ n ] ;
  sum [ 0 ] = ar [ 0 ] ;
  sum [ 1 ] = ar [ 1 ] ;
  sum [ 2 ] = ar [ 2 ] ;
  sum [ 3 ] = ar [ 3 ] ;
  for ( int i = 4 ;
  i < n ;
  i ++ ) sum [ i ] = ar [ i ] + Arrays . stream ( Arrays . copyOfRange ( sum , i - 4 , i ) ) . min ( ) . getAsInt ( ) ;
  return Arrays . stream ( Arrays . copyOfRange ( sum , n - 4 , n ) ) . min ( ) . getAsInt ( ) ;
}


//TOFILL

}
