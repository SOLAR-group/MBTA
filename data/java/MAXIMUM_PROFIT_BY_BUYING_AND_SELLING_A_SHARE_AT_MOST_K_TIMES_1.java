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
public class MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_K_TIMES_1{
static int f_gold ( int price [ ] , int n , int k ) {
  int profit [ ] [ ] = new int [ k + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i <= k ;
  i ++ ) profit [ i ] [ 0 ] = 0 ;
  for ( int j = 0 ;
  j <= n ;
  j ++ ) profit [ 0 ] [ j ] = 0 ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    int prevDiff = Integer . MIN_VALUE ;
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      prevDiff = Math . max ( prevDiff , profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] ) ;
      profit [ i ] [ j ] = Math . max ( profit [ i ] [ j - 1 ] , price [ j ] + prevDiff ) ;
    }
  }
  return profit [ k ] [ n - 1 ] ;
}


//TOFILL

}
