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
public class NUMBER_N_DIGIT_STEPPING_NUMBERS{
static long f_gold ( int n ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ 10 ] ;
  if ( n == 1 ) return 10 ;
  for ( int j = 0 ;
  j <= 9 ;
  j ++ ) dp [ 1 ] [ j ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= 9 ;
    j ++ ) {
      if ( j == 0 ) dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ] ;
      else if ( j == 9 ) dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] ;
      else dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ] ;
    }
  }
  long sum = 0 ;
  for ( int j = 1 ;
  j <= 9 ;
  j ++ ) sum += dp [ n ] [ j ] ;
  return sum ;
}


//TOFILL

}
