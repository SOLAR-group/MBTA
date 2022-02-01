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
public class FIND_REPEATED_CHARACTER_PRESENT_FIRST_STRING{
static int f_gold ( String s ) {
  int p = - 1 , i , j ;
  for ( i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    for ( j = i + 1 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( s . charAt ( i ) == s . charAt ( j ) ) {
        p = i ;
        break ;
      }
    }
    if ( p != - 1 ) break ;
  }
  return p ;
}


//TOFILL

}
