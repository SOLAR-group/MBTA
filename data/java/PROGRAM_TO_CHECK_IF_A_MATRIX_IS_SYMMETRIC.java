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
public class PROGRAM_TO_CHECK_IF_A_MATRIX_IS_SYMMETRIC{
static boolean f_gold ( int mat [ ] [ ] , int N ) {
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) if ( mat [ i ] [ j ] != mat [ j ] [ i ] ) return false ;
  return true ;
}


//TOFILL

}
