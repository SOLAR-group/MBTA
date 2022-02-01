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
public class DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > mp = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( mp . containsKey ( arr [ i ] ) ) {
      mp . put ( arr [ i ] , mp . get ( arr [ i ] ) + 1 ) ;
    }
    else {
      mp . put ( arr [ i ] , 1 ) ;
    }
  }
  int max_count = 0 , min_count = n ;
  for ( Map . Entry < Integer , Integer > x : mp . entrySet ( ) ) {
    max_count = Math . max ( max_count , x . getValue ( ) ) ;
    min_count = Math . min ( min_count , x . getValue ( ) ) ;
  }
  return ( max_count - min_count ) ;
}


//TOFILL

}
