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
public class CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING{
static int f_gold ( String str ) {
  int res = str . charAt ( 0 ) - '0' ;
  for ( int i = 1 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == '0' || str . charAt ( i ) == '1' || res < 2 ) res += ( str . charAt ( i ) - '0' ) ;
    else res *= ( str . charAt ( i ) - '0' ) ;
  }
  return res ;
}


//TOFILL

}
