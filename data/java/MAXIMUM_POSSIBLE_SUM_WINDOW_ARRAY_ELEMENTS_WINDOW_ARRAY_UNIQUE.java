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
public class MAXIMUM_POSSIBLE_SUM_WINDOW_ARRAY_ELEMENTS_WINDOW_ARRAY_UNIQUE{
static int f_gold ( int A [ ] , int B [ ] , int n ) {
  Set < Integer > mp = new HashSet < Integer > ( ) ;
  int result = 0 ;
  int curr_sum = 0 , curr_begin = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    while ( mp . contains ( A [ i ] ) ) {
      mp . remove ( A [ curr_begin ] ) ;
      curr_sum -= B [ curr_begin ] ;
      curr_begin ++ ;
    }
    mp . add ( A [ i ] ) ;
    curr_sum += B [ i ] ;
    result = Integer . max ( result , curr_sum ) ;
  }
  return result ;
}


//TOFILL

}
