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
public class CHECK_GIVEN_MATRIX_SPARSE_NOT{
static boolean f_gold ( int array [ ] [ ] , int m , int n ) {
  int counter = 0 ;
  for ( int i = 0 ;
  i < m ;
  ++ i ) for ( int j = 0 ;
  j < n ;
  ++ j ) if ( array [ i ] [ j ] == 0 ) ++ counter ;
  return ( counter > ( ( m * n ) / 2 ) ) ;
}


//TOFILL

}
