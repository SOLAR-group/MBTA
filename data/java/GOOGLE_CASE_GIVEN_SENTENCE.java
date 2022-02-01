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
public class GOOGLE_CASE_GIVEN_SENTENCE{
static String f_gold ( String s ) {
  int n = s . length ( ) ;
  String s1 = "" ;
  s1 = s1 + Character . toLowerCase ( s . charAt ( 0 ) ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == ' ' && i < n ) {
      s1 = s1 + " " + Character . toLowerCase ( s . charAt ( i + 1 ) ) ;
      i ++ ;
    }
    else s1 = s1 + Character . toUpperCase ( s . charAt ( i ) ) ;
  }
  return s1 ;
}


//TOFILL

}
