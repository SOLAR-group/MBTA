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
public class FIND_SUM_UNIQUE_SUB_ARRAY_SUM_GIVEN_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int res = 0 ;
  HashMap < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int sum = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      sum += arr [ j ] ;
      if ( m . containsKey ( sum ) ) {
        m . put ( sum , m . get ( sum ) + 1 ) ;
      }
      else {
        m . put ( sum , 1 ) ;
      }
    }
  }
  for ( Map . Entry < Integer , Integer > x : m . entrySet ( ) ) if ( x . getValue ( ) == 1 ) res += x . getKey ( ) ;
  return res ;
}


//TOFILL

}
