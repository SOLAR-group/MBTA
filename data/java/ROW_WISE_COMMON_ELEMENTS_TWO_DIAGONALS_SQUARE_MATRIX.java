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
public class ROW_WISE_COMMON_ELEMENTS_TWO_DIAGONALS_SQUARE_MATRIX{
static int f_gold ( int mat [ ] [ ] , int n ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( mat [ i ] [ i ] == mat [ i ] [ n - i - 1 ] ) res ++ ;
  return res ;
}


//TOFILL

}
