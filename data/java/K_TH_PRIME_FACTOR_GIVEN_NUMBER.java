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
public class K_TH_PRIME_FACTOR_GIVEN_NUMBER{
static int f_gold ( int n , int k ) {
  while ( n % 2 == 0 ) {
    k -- ;
    n = n / 2 ;
    if ( k == 0 ) return 2 ;
  }
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i = i + 2 ) {
    while ( n % i == 0 ) {
      if ( k == 1 ) return i ;
      k -- ;
      n = n / i ;
    }
  }
  if ( n > 2 && k == 1 ) return n ;
  return - 1 ;
}


//TOFILL

}
