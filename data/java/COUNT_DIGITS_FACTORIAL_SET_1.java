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
public class COUNT_DIGITS_FACTORIAL_SET_1{
static int f_gold ( int n ) {
  if ( n < 0 ) return 0 ;
  if ( n <= 1 ) return 1 ;
  double digits = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) digits += Math . log10 ( i ) ;
  return ( int ) ( Math . floor ( digits ) ) + 1 ;
}


//TOFILL

}
