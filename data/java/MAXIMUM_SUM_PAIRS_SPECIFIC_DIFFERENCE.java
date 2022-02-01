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
public class MAXIMUM_SUM_PAIRS_SPECIFIC_DIFFERENCE{
static int f_gold ( int arr [ ] , int N , int K ) {
  Arrays . sort ( arr ) ;
  int dp [ ] = new int [ N ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    dp [ i ] = dp [ i - 1 ] ;
    if ( arr [ i ] - arr [ i - 1 ] < K ) {
      if ( i >= 2 ) dp [ i ] = Math . max ( dp [ i ] , dp [ i - 2 ] + arr [ i ] + arr [ i - 1 ] ) ;
      else dp [ i ] = Math . max ( dp [ i ] , arr [ i ] + arr [ i - 1 ] ) ;
    }
  }
  return dp [ N - 1 ] ;
}


//TOFILL

}
