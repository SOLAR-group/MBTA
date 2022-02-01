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
public class COUNT_TOTAL_SET_BITS_IN_ALL_NUMBERS_FROM_1_TO_N{
static int f_gold ( int n ) {
  int i = 0 ;
  int ans = 0 ;
  while ( ( 1 << i ) <= n ) {
    boolean k = false ;
    int change = 1 << i ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( k == true ) ans += 1 ;
      else ans += 0 ;
      if ( change == 1 ) {
        k = ! k ;
        change = 1 << i ;
      }
      else {
        change -- ;
      }
    }
    i ++ ;
  }
  return ans ;
}


//TOFILL

}
