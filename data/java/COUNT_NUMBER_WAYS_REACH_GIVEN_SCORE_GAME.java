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
public class COUNT_NUMBER_WAYS_REACH_GIVEN_SCORE_GAME{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] , i ;
  Arrays . fill ( table , 0 ) ;
  table [ 0 ] = 1 ;
  for ( i = 3 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 3 ] ;
  for ( i = 5 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 5 ] ;
  for ( i = 10 ;
  i <= n ;
  i ++ ) table [ i ] += table [ i - 10 ] ;
  return table [ n ] ;
}


//TOFILL

}
