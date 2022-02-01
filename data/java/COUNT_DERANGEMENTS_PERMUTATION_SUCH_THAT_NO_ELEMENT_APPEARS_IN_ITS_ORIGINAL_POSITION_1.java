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
public class COUNT_DERANGEMENTS_PERMUTATION_SUCH_THAT_NO_ELEMENT_APPEARS_IN_ITS_ORIGINAL_POSITION_1{
static int f_gold ( int n ) {
  int der [ ] = new int [ n + 1 ] ;
  der [ 0 ] = 1 ;
  der [ 1 ] = 0 ;
  der [ 2 ] = 1 ;
  for ( int i = 3 ;
  i <= n ;
  ++ i ) der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] ) ;
  return der [ n ] ;
}


//TOFILL

}
