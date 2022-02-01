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
public class COUNT_SUBARRAYS_EQUAL_NUMBER_1S_0S{
static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > um = new HashMap < > ( ) ;
  int curr_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    curr_sum += ( arr [ i ] == 0 ) ? - 1 : arr [ i ] ;
    um . put ( curr_sum , um . get ( curr_sum ) == null ? 1 : um . get ( curr_sum ) + 1 ) ;
  }
  int count = 0 ;
  for ( Map . Entry < Integer , Integer > itr : um . entrySet ( ) ) {
    if ( itr . getValue ( ) > 1 ) count += ( ( itr . getValue ( ) * ( itr . getValue ( ) - 1 ) ) / 2 ) ;
  }
  if ( um . containsKey ( 0 ) ) count += um . get ( 0 ) ;
  return count ;
}


//TOFILL

}
