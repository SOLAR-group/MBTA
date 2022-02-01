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
public class STEINS_ALGORITHM_FOR_FINDING_GCD{
static int f_gold ( int a , int b ) {
  if ( a == 0 ) return b ;
  if ( b == 0 ) return a ;
  int k ;
  for ( k = 0 ;
  ( ( a | b ) & 1 ) == 0 ;
  ++ k ) {
    a >>= 1 ;
    b >>= 1 ;
  }
  while ( ( a & 1 ) == 0 ) a >>= 1 ;
  do {
    while ( ( b & 1 ) == 0 ) b >>= 1 ;
    if ( a > b ) {
      int temp = a ;
      a = b ;
      b = temp ;
    }
    b = ( b - a ) ;
  }
  while ( b != 0 ) ;
  return a << k ;
}


//TOFILL

}
