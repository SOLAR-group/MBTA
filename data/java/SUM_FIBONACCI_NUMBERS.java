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
public class SUM_FIBONACCI_NUMBERS{
static int f_gold ( int n ) {
  if ( n <= 0 ) return 0 ;
  int fibo [ ] = new int [ n + 1 ] ;
  fibo [ 0 ] = 0 ;
  fibo [ 1 ] = 1 ;
  int sum = fibo [ 0 ] + fibo [ 1 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    fibo [ i ] = fibo [ i - 1 ] + fibo [ i - 2 ] ;
    sum += fibo [ i ] ;
  }
  return sum ;
}


//TOFILL

}
