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
public class COUNT_NUMBER_OF_SOLUTIONS_OF_X2_1_MOD_P_IN_GIVEN_RANGE{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  for ( int x = 1 ;
  x < p ;
  x ++ ) {
    if ( ( x * x ) % p == 1 ) {
      int last = x + p * ( n / p ) ;
      if ( last > n ) last -= p ;
      ans += ( ( last - x ) / p + 1 ) ;
    }
  }
  return ans ;
}


//TOFILL

}
