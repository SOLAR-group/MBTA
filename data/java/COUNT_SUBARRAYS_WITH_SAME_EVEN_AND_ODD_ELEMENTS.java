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
public class COUNT_SUBARRAYS_WITH_SAME_EVEN_AND_ODD_ELEMENTS{
static int f_gold ( int [ ] arr , int n ) {
  int difference = 0 ;
  int ans = 0 ;
  int [ ] hash_positive = new int [ n + 1 ] ;
  int [ ] hash_negative = new int [ n + 1 ] ;
  hash_positive [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( arr [ i ] & 1 ) == 1 ) {
      difference ++ ;
    }
    else {
      difference -- ;
    }
    if ( difference < 0 ) {
      ans += hash_negative [ - difference ] ;
      hash_negative [ - difference ] ++ ;
    }
    else {
      ans += hash_positive [ difference ] ;
      hash_positive [ difference ] ++ ;
    }
  }
  return ans ;
}


//TOFILL

}
