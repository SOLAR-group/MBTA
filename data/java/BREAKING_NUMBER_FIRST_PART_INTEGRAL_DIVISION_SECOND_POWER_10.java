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
public class BREAKING_NUMBER_FIRST_PART_INTEGRAL_DIVISION_SECOND_POWER_10{
static int f_gold ( String N ) {
  int len = N . length ( ) ;
  int l = ( len ) / 2 ;
  int count = 0 ;
  for ( int i = 1 ;
  i <= l ;
  i ++ ) {
    String s = N . substring ( 0 , i ) ;
    int l1 = s . length ( ) ;
    String t = N . substring ( i , l1 + i ) ;
    if ( s . charAt ( 0 ) == '0' || t . charAt ( 0 ) == '0' ) continue ;
    if ( s . compareTo ( t ) == 0 ) count ++ ;
  }
  return count ;
}


//TOFILL

}
