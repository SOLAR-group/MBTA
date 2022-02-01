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
public class CENTER_ELEMENT_OF_MATRIX_EQUALS_SUMS_OF_HALF_DIAGONALS{
static boolean f_gold ( int mat [ ] [ ] , int n ) {
  int diag1_left = 0 , diag1_right = 0 ;
  int diag2_left = 0 , diag2_right = 0 ;
  for ( int i = 0 , j = n - 1 ;
  i < n ;
  i ++ , j -- ) {
    if ( i < n / 2 ) {
      diag1_left += mat [ i ] [ i ] ;
      diag2_left += mat [ j ] [ i ] ;
    }
    else if ( i > n / 2 ) {
      diag1_right += mat [ i ] [ i ] ;
      diag2_right += mat [ j ] [ i ] ;
    }
  }
  return ( diag1_left == diag2_right && diag2_right == diag2_left && diag1_right == diag2_left && diag2_right == mat [ n / 2 ] [ n / 2 ] ) ;
}


//TOFILL

}
