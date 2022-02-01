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
public class DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION{
static int f_gold ( int p [ ] , int i , int j ) {
  if ( i == j ) return 0 ;
  int min = Integer . MAX_VALUE ;
  for ( int k = i ;
  k < j ;
  k ++ ) {
    int count = f_gold ( p , i , k ) + f_gold ( p , k + 1 , j ) + p [ i - 1 ] * p [ k ] * p [ j ] ;
    if ( count < min ) min = count ;
  }
  return min ;
}


//TOFILL

}
