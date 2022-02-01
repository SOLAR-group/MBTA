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
public class FIND_THE_MISSING_NUMBER_2{
static int f_gold ( int a [ ] , int n ) {
  int x1 = a [ 0 ] ;
  int x2 = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) x1 = x1 ^ a [ i ] ;
  for ( int i = 2 ;
  i <= n + 1 ;
  i ++ ) x2 = x2 ^ i ;
  return ( x1 ^ x2 ) ;
}


//TOFILL

}
