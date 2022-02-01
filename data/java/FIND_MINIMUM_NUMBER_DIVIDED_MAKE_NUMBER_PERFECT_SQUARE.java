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
public class FIND_MINIMUM_NUMBER_DIVIDED_MAKE_NUMBER_PERFECT_SQUARE{
static int f_gold ( int n ) {
  int count = 0 , ans = 1 ;
  while ( n % 2 == 0 ) {
    count ++ ;
    n /= 2 ;
  }
  if ( count % 2 == 1 ) ans *= 2 ;
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i += 2 ) {
    count = 0 ;
    while ( n % i == 0 ) {
      count ++ ;
      n /= i ;
    }
    if ( count % 2 == 1 ) ans *= i ;
  }
  if ( n > 2 ) ans *= n ;
  return ans ;
}


//TOFILL

}
