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
public class COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 1 ;
  i <= 9 ;
  i ++ ) {
    Stack < Integer > s = new Stack < > ( ) ;
    if ( i <= n ) {
      s . push ( i ) ;
      result ++ ;
    }
    while ( ! s . empty ( ) ) {
      int tp = s . peek ( ) ;
      s . pop ( ) ;
      for ( int j = tp % 10 ;
      j <= 9 ;
      j ++ ) {
        int x = tp * 10 + j ;
        if ( x <= n ) {
          s . push ( x ) ;
          result ++ ;
        }
      }
    }
  }
  return result ;
}


//TOFILL

}
