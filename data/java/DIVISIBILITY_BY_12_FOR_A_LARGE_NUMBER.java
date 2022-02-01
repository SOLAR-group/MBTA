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
public class DIVISIBILITY_BY_12_FOR_A_LARGE_NUMBER{
static boolean f_gold ( String num ) {
  if ( num . length ( ) >= 3 ) {
    int d1 = ( int ) num . charAt ( num . length ( ) - 1 ) ;
    if ( d1 % 2 != 0 ) return false ;
    int d2 = ( int ) num . charAt ( num . length ( ) - 2 ) ;
    int sum = 0 ;
    for ( int i = 0 ;
    i < num . length ( ) ;
    i ++ ) sum += num . charAt ( i ) ;
    return ( sum % 3 == 0 && ( d2 * 10 + d1 ) % 4 == 0 ) ;
  }
  else {
    int number = Integer . parseInt ( num ) ;
    return ( number % 12 == 0 ) ;
  }
}


//TOFILL

}
