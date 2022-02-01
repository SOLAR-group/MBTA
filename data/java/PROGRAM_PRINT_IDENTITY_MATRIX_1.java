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
public class PROGRAM_PRINT_IDENTITY_MATRIX_1{
static boolean f_gold ( int mat [ ] [ ] , int N ) {
  for ( int row = 0 ;
  row < N ;
  row ++ ) {
    for ( int col = 0 ;
    col < N ;
    col ++ ) {
      if ( row == col && mat [ row ] [ col ] != 1 ) return false ;
      else if ( row != col && mat [ row ] [ col ] != 0 ) return false ;
    }
  }
  return true ;
}


//TOFILL

}
