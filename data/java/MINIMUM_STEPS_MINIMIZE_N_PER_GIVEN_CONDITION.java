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
public class MINIMUM_STEPS_MINIMIZE_N_PER_GIVEN_CONDITION{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) table [ i ] = n - i ;
  for ( int i = n ;
  i >= 1 ;
  i -- ) {
    if ( ! ( i % 2 > 0 ) ) table [ i / 2 ] = Math . min ( table [ i ] + 1 , table [ i / 2 ] ) ;
    if ( ! ( i % 3 > 0 ) ) table [ i / 3 ] = Math . min ( table [ i ] + 1 , table [ i / 3 ] ) ;
  }
  return table [ 1 ] ;
}


//TOFILL

}
