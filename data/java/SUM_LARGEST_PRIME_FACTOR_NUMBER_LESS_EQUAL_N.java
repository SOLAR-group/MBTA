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
public class SUM_LARGEST_PRIME_FACTOR_NUMBER_LESS_EQUAL_N{
static int f_gold ( int n ) {
  int prime [ ] = new int [ n + 1 ] , sum = 0 ;
  Arrays . fill ( prime , 0 ) ;
  int max = n / 2 ;
  for ( int p = 2 ;
  p <= max ;
  p ++ ) {
    if ( prime [ p ] == 0 ) {
      for ( int i = p * 2 ;
      i <= n ;
      i += p ) prime [ i ] = p ;
    }
  }
  for ( int p = 2 ;
  p <= n ;
  p ++ ) {
    if ( prime [ p ] != 0 ) sum += prime [ p ] ;
    else sum += p ;
  }
  return sum ;
}


//TOFILL

}
