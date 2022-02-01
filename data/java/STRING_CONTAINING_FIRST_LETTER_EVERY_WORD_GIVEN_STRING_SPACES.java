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
public class STRING_CONTAINING_FIRST_LETTER_EVERY_WORD_GIVEN_STRING_SPACES{
static String f_gold ( String str ) {
  String result = "" ;
  boolean v = true ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( str . charAt ( i ) == ' ' ) {
      v = true ;
    }
    else if ( str . charAt ( i ) != ' ' && v == true ) {
      result += ( str . charAt ( i ) ) ;
      v = false ;
    }
  }
  return result ;
}


//TOFILL

}
