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
public class SUM_FACTORS_NUMBER{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 2 ;
  i <= Math . sqrt ( n ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      if ( i == ( n / i ) ) result += i ;
      else result += ( i + n / i ) ;
    }
  }
  return ( result + n + 1 ) ;
}


//TOFILL

}
