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
public class COUNT_OF_PAIRS_SATISFYING_THE_GIVEN_CONDITION{
static int f_gold ( int a , int b ) {
  String s = String . valueOf ( b ) ;
  int i ;
  for ( i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != '9' ) break ;
  }
  int result ;
  if ( i == s . length ( ) ) result = a * s . length ( ) ;
  else result = a * ( s . length ( ) - 1 ) ;
  return result ;
}


//TOFILL

}
