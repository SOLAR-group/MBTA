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
public class DIFFERENCE_BETWEEN_HIGHEST_AND_LEAST_FREQUENCIES_IN_AN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . sort ( arr ) ;
  int count = 0 , max_count = 0 , min_count = n ;
  for ( int i = 0 ;
  i < ( n - 1 ) ;
  i ++ ) {
    if ( arr [ i ] == arr [ i + 1 ] ) {
      count += 1 ;
      continue ;
    }
    else {
      max_count = Math . max ( max_count , count ) ;
      min_count = Math . min ( min_count , count ) ;
      count = 0 ;
    }
  }
  return ( max_count - min_count ) ;
}


//TOFILL

}
