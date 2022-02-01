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
public class COUNT_OF_OCCURRENCES_OF_A_101_PATTERN_IN_A_STRING{
static int f_gold ( String str ) {
  int len = str . length ( ) ;
  boolean oneSeen = false ;
  int count = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    char getChar = str . charAt ( i ) ;
    if ( getChar == '1' && oneSeen == true ) {
      if ( str . charAt ( i - 1 ) == '0' ) count ++ ;
    }
    if ( getChar == '1' && oneSeen == false ) oneSeen = true ;
    if ( getChar != '0' && str . charAt ( i ) != '1' ) oneSeen = false ;
  }
  return count ;
}


//TOFILL

}
