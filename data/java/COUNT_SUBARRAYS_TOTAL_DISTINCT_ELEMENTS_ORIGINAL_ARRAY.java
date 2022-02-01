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
public class COUNT_SUBARRAYS_TOTAL_DISTINCT_ELEMENTS_ORIGINAL_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > vis = new HashMap < Integer , Integer > ( ) {
    @ Override public Integer get ( Object key ) {
      if ( ! containsKey ( key ) ) return 0 ;
      return super . get ( key ) ;
    }
  };
  for ( int i = 0 ;
  i < n ;
  ++ i ) vis . put ( arr [ i ] , 1 ) ;
  int k = vis . size ( ) ;
  vis . clear ( ) ;
  int ans = 0 , right = 0 , window = 0 ;
  for ( int left = 0 ;
  left < n ;
  ++ left ) {
    while ( right < n && window < k ) {
      vis . put ( arr [ right ] , vis . get ( arr [ right ] ) + 1 ) ;
      if ( vis . get ( arr [ right ] ) == 1 ) ++ window ;
      ++ right ;
    }
    if ( window == k ) ans += ( n - right + 1 ) ;
    vis . put ( arr [ left ] , vis . get ( arr [ left ] ) - 1 ) ;
    if ( vis . get ( arr [ left ] ) == 0 ) -- window ;
  }
  return ans ;
}


//TOFILL

}
