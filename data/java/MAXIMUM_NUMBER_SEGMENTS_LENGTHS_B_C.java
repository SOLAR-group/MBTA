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
public class MAXIMUM_NUMBER_SEGMENTS_LENGTHS_B_C{
static int f_gold ( int n , int a , int b , int c ) {
  int dp [ ] = new int [ n + 10 ] ;
  Arrays . fill ( dp , - 1 ) ;
  dp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( dp [ i ] != - 1 ) {
      if ( i + a <= n ) dp [ i + a ] = Math . max ( dp [ i ] + 1 , dp [ i + a ] ) ;
      if ( i + b <= n ) dp [ i + b ] = Math . max ( dp [ i ] + 1 , dp [ i + b ] ) ;
      if ( i + c <= n ) dp [ i + c ] = Math . max ( dp [ i ] + 1 , dp [ i + c ] ) ;
    }
  }
  return dp [ n ] ;
}


//TOFILL

}
