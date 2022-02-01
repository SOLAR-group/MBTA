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
public class PAINTING_FENCE_ALGORITHM{
static long f_gold ( int n , int k ) {
  long total = k ;
  int mod = 1000000007 ;
  int same = 0 , diff = k ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    same = diff ;
    diff = ( int ) total * ( k - 1 ) ;
    diff = diff % mod ;
    total = ( same + diff ) % mod ;
  }
  return total ;
}


//TOFILL

}
