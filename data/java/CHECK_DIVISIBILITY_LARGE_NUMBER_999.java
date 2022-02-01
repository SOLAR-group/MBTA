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
public class CHECK_DIVISIBILITY_LARGE_NUMBER_999{
static boolean f_gold ( String num ) {
  int n = num . length ( ) ;
  if ( n == 0 && num . charAt ( 0 ) == '0' ) return true ;
  if ( n % 3 == 1 ) num = "00" + num ;
  if ( n % 3 == 2 ) num = "0" + num ;
  int gSum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int group = 0 ;
    group += ( num . charAt ( i ++ ) - '0' ) * 100 ;
    group += ( num . charAt ( i ++ ) - '0' ) * 10 ;
    group += num . charAt ( i ) - '0' ;
    gSum += group ;
  }
  if ( gSum > 1000 ) {
    num = Integer . toString ( gSum ) ;
    n = num . length ( ) ;
    gSum = f_gold ( num ) ? 1 : 0 ;
  }
  return ( gSum == 999 ) ;
}


//TOFILL

}
