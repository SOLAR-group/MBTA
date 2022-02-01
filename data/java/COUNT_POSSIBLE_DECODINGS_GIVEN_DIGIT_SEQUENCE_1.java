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
public class COUNT_POSSIBLE_DECODINGS_GIVEN_DIGIT_SEQUENCE_1{
static int f_gold ( char digits [ ] , int n ) {
  int count [ ] = new int [ n + 1 ] ;
  count [ 0 ] = 1 ;
  count [ 1 ] = 1 ;
  if ( digits [ 0 ] == '0' ) return 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    count [ i ] = 0 ;
    if ( digits [ i - 1 ] > '0' ) count [ i ] = count [ i - 1 ] ;
    if ( digits [ i - 2 ] == '1' || ( digits [ i - 2 ] == '2' && digits [ i - 1 ] < '7' ) ) count [ i ] += count [ i - 2 ] ;
  }
  return count [ n ] ;
}


//TOFILL

}
