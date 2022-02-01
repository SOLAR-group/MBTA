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
public class SUM_OF_ALL_PROPER_DIVISORS_OF_A_NATURAL_NUMBER{
static int f_gold ( int num ) {
  int result = 0 ;
  for ( int i = 2 ;
  i <= Math . sqrt ( num ) ;
  i ++ ) {
    if ( num % i == 0 ) {
      if ( i == ( num / i ) ) result += i ;
      else result += ( i + num / i ) ;
    }
  }
  return ( result + 1 ) ;
}


//TOFILL

}
