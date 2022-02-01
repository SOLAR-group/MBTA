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
public class PROGRAM_CHECK_ISBN{
static boolean f_gold ( String isbn ) {
  int n = isbn . length ( ) ;
  if ( n != 10 ) return false ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    int digit = isbn . charAt ( i ) - '0' ;
    if ( 0 > digit || 9 < digit ) return false ;
    sum += ( digit * ( 10 - i ) ) ;
  }
  char last = isbn . charAt ( 9 ) ;
  if ( last != 'X' && ( last < '0' || last > '9' ) ) return false ;
  sum += ( ( last == 'X' ) ? 10 : ( last - '0' ) ) ;
  return ( sum % 11 == 0 ) ;
}


//TOFILL

}
