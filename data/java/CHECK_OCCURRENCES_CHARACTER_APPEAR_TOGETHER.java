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
public class CHECK_OCCURRENCES_CHARACTER_APPEAR_TOGETHER{
static boolean f_gold ( String s , char c ) {
  boolean oneSeen = false ;
  int i = 0 , n = s . length ( ) ;
  while ( i < n ) {
    if ( s . charAt ( i ) == c ) {
      if ( oneSeen == true ) return false ;
      while ( i < n && s . charAt ( i ) == c ) i ++ ;
      oneSeen = true ;
    }
    else i ++ ;
  }
  return true ;
}


//TOFILL

}
