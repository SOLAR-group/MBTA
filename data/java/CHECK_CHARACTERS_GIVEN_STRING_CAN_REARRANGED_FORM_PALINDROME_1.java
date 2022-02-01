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
public class CHECK_CHARACTERS_GIVEN_STRING_CAN_REARRANGED_FORM_PALINDROME_1{
static boolean f_gold ( String str ) {
  List < Character > list = new ArrayList < Character > ( ) ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( list . contains ( str . charAt ( i ) ) ) list . remove ( ( Character ) str . charAt ( i ) ) ;
    else list . add ( str . charAt ( i ) ) ;
  }
  if ( str . length ( ) % 2 == 0 && list . isEmpty ( ) || ( str . length ( ) % 2 == 1 && list . size ( ) == 1 ) ) return true ;
  else return false ;
}


//TOFILL

}
