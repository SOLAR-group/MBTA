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
public class NUMBER_SUBSTRINGS_DIVISIBLE_4_STRING_INTEGERS{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) if ( s . charAt ( i ) == '4' || s . charAt ( i ) == '8' || s . charAt ( i ) == '0' ) count ++ ;
  for ( int i = 0 ;
  i < n - 1 ;
  ++ i ) {
    int h = ( s . charAt ( i ) - '0' ) * 10 + ( s . charAt ( i + 1 ) - '0' ) ;
    if ( h % 4 == 0 ) count = count + i + 1 ;
  }
  return count ;
}


//TOFILL

}
