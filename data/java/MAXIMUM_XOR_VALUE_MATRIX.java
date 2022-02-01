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
public class MAXIMUM_XOR_VALUE_MATRIX{
static int f_gold ( int mat [ ] [ ] , int N ) {
  int r_xor , c_xor ;
  int max_xor = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r_xor = 0 ;
    c_xor = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      r_xor = r_xor ^ mat [ i ] [ j ] ;
      c_xor = c_xor ^ mat [ j ] [ i ] ;
    }
    if ( max_xor < Math . max ( r_xor , c_xor ) ) max_xor = Math . max ( r_xor , c_xor ) ;
  }
  return max_xor ;
}


//TOFILL

}
