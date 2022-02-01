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
public class NUMBER_SUBSEQUENCES_STRING_DIVISIBLE_N{
static int f_gold ( String str , int n ) {
  int len = str . length ( ) ;
  int dp [ ] [ ] = new int [ len ] [ n ] ;
  dp [ 0 ] [ ( str . charAt ( 0 ) - '0' ) % n ] ++ ;
  for ( int i = 1 ;
  i < len ;
  i ++ ) {
    dp [ i ] [ ( str . charAt ( i ) - '0' ) % n ] ++ ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      dp [ i ] [ j ] += dp [ i - 1 ] [ j ] ;
      dp [ i ] [ ( j * 10 + ( str . charAt ( i ) - '0' ) ) % n ] += dp [ i - 1 ] [ j ] ;
    }
  }
  return dp [ len - 1 ] [ 0 ] ;
}


//TOFILL

}
