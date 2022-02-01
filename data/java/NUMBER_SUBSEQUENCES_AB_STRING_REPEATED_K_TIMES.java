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
public class NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES{
static int f_gold ( String s , int K ) {
  int n = s . length ( ) ;
  int C = 0 , c1 = 0 , c2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'a' ) c1 ++ ;
    if ( s . charAt ( i ) == 'b' ) {
      c2 ++ ;
      C += c1 ;
    }
  }
  return C * K + ( K * ( K - 1 ) / 2 ) * c1 * c2 ;
}


//TOFILL

}
