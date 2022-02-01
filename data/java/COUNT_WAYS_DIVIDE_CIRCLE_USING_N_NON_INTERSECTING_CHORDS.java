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
public class COUNT_WAYS_DIVIDE_CIRCLE_USING_N_NON_INTERSECTING_CHORDS{
static int f_gold ( int A ) {
  int n = 2 * A ;
  int [ ] dpArray = new int [ n + 1 ] ;
  dpArray [ 0 ] = 1 ;
  dpArray [ 2 ] = 1 ;
  for ( int i = 4 ;
  i <= n ;
  i += 2 ) {
    for ( int j = 0 ;
    j < i - 1 ;
    j += 2 ) {
      dpArray [ i ] += ( dpArray [ j ] * dpArray [ i - 2 - j ] ) ;
    }
  }
  return dpArray [ n ] ;
}


//TOFILL

}
