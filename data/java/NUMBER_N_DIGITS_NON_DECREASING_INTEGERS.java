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
public class NUMBER_N_DIGITS_NON_DECREASING_INTEGERS{
static int f_gold ( int n ) {
  int [ ] [ ] a = new int [ n + 1 ] [ 10 ] ;
  for ( int i = 0 ;
  i <= 9 ;
  i ++ ) a [ 0 ] [ i ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) a [ i ] [ 9 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = 8 ;
  j >= 0 ;
  j -- ) a [ i ] [ j ] = a [ i - 1 ] [ j ] + a [ i ] [ j + 1 ] ;
  return a [ n ] [ 0 ] ;
}


//TOFILL

}
