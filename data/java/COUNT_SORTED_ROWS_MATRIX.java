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
public class COUNT_SORTED_ROWS_MATRIX{
static int f_gold ( int mat [ ] [ ] , int r , int c ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int j ;
    for ( j = 0 ;
    j < c - 1 ;
    j ++ ) if ( mat [ i ] [ j + 1 ] <= mat [ i ] [ j ] ) break ;
    if ( j == c - 1 ) result ++ ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int j ;
    for ( j = c - 1 ;
    j > 0 ;
    j -- ) if ( mat [ i ] [ j - 1 ] <= mat [ i ] [ j ] ) break ;
    if ( c > 1 && j == 0 ) result ++ ;
  }
  return result ;
}


//TOFILL

}
