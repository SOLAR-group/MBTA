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
public class GIVEN_A_SORTED_AND_ROTATED_ARRAY_FIND_IF_THERE_IS_A_PAIR_WITH_A_GIVEN_SUM_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int i ;
  for ( i = 0 ;
  i < n - 1 ;
  i ++ ) if ( arr [ i ] > arr [ i + 1 ] ) break ;
  int l = ( i + 1 ) % n ;
  int r = i ;
  int cnt = 0 ;
  while ( l != r ) {
    if ( arr [ l ] + arr [ r ] == x ) {
      cnt ++ ;
      if ( l == ( r - 1 + n ) % n ) {
        return cnt ;
      }
      l = ( l + 1 ) % n ;
      r = ( r - 1 + n ) % n ;
    }
    else if ( arr [ l ] + arr [ r ] < x ) l = ( l + 1 ) % n ;
    else r = ( n + r - 1 ) % n ;
  }
  return cnt ;
}


//TOFILL

}
