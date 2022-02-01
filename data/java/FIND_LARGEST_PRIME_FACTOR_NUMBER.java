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
public class FIND_LARGEST_PRIME_FACTOR_NUMBER{
static long f_gold ( long n ) {
  long maxPrime = - 1 ;
  while ( n % 2 == 0 ) {
    maxPrime = 2 ;
    n >>= 1 ;
  }
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i += 2 ) {
    while ( n % i == 0 ) {
      maxPrime = i ;
      n = n / i ;
    }
  }
  if ( n > 2 ) maxPrime = n ;
  return maxPrime ;
}


//TOFILL

}
