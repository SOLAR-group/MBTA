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
public class COUNT_ROTATIONS_DIVISIBLE_4{
static int f_gold ( String n ) {
  int len = n . length ( ) ;
  if ( len == 1 ) {
    int oneDigit = n . charAt ( 0 ) - '0' ;
    if ( oneDigit % 4 == 0 ) return 1 ;
    return 0 ;
  }
  int twoDigit , count = 0 ;
  for ( int i = 0 ;
  i < ( len - 1 ) ;
  i ++ ) {
    twoDigit = ( n . charAt ( i ) - '0' ) * 10 + ( n . charAt ( i + 1 ) - '0' ) ;
    if ( twoDigit % 4 == 0 ) count ++ ;
  }
  twoDigit = ( n . charAt ( len - 1 ) - '0' ) * 10 + ( n . charAt ( 0 ) - '0' ) ;
  if ( twoDigit % 4 == 0 ) count ++ ;
  return count ;
}


//TOFILL

}
