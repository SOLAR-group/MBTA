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
public class COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING{
static int f_gold ( String str ) {
  int N = str . length ( ) ;
  int [ ] [ ] cps = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cps [ i ] [ i ] = 1 ;
  for ( int L = 2 ;
  L <= N ;
  L ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int k = L + i - 1 ;
      if ( k < N ) {
        if ( str . charAt ( i ) == str . charAt ( k ) ) cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] + 1 ;
        else cps [ i ] [ k ] = cps [ i ] [ k - 1 ] + cps [ i + 1 ] [ k ] - cps [ i + 1 ] [ k - 1 ] ;
      }
    }
  }
  return cps [ 0 ] [ N - 1 ] ;
}


//TOFILL

}
