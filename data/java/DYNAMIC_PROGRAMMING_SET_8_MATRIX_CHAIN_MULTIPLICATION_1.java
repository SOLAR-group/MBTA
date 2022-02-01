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
public class DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION_1{
static int f_gold ( int p [ ] , int n ) {
  int m [ ] [ ] = new int [ n ] [ n ] ;
  int i , j , k , L , q ;
  for ( i = 1 ;
  i < n ;
  i ++ ) m [ i ] [ i ] = 0 ;
  for ( L = 2 ;
  L < n ;
  L ++ ) {
    for ( i = 1 ;
    i < n - L + 1 ;
    i ++ ) {
      j = i + L - 1 ;
      if ( j == n ) continue ;
      m [ i ] [ j ] = Integer . MAX_VALUE ;
      for ( k = i ;
      k <= j - 1 ;
      k ++ ) {
        q = m [ i ] [ k ] + m [ k + 1 ] [ j ] + p [ i - 1 ] * p [ k ] * p [ j ] ;
        if ( q < m [ i ] [ j ] ) m [ i ] [ j ] = q ;
      }
    }
  }
  return m [ 1 ] [ n - 1 ] ;
}


//TOFILL

}
