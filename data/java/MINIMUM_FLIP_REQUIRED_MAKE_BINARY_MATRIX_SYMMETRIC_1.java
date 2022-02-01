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
public class MINIMUM_FLIP_REQUIRED_MAKE_BINARY_MATRIX_SYMMETRIC_1{
static int f_gold ( int mat [ ] [ ] , int n ) {
  int flip = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( mat [ i ] [ j ] != mat [ j ] [ i ] ) flip ++ ;
  return flip ;
}


//TOFILL

}
