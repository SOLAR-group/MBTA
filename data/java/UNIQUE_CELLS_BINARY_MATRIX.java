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
public class UNIQUE_CELLS_BINARY_MATRIX{
static int f_gold ( int mat [ ] [ ] , int n , int m ) {
  int [ ] rowsum = new int [ n ] ;
  int [ ] colsum = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < m ;
  j ++ ) if ( mat [ i ] [ j ] != 0 ) {
    rowsum [ i ] ++ ;
    colsum [ j ] ++ ;
  }
  int uniquecount = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < m ;
  j ++ ) if ( mat [ i ] [ j ] != 0 && rowsum [ i ] == 1 && colsum [ j ] == 1 ) uniquecount ++ ;
  return uniquecount ;
}


//TOFILL

}
