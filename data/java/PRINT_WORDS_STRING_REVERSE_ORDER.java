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
public class PRINT_WORDS_STRING_REVERSE_ORDER{
static String f_gold ( String str ) {
  int i = str . length ( ) - 1 ;
  int start , end = i + 1 ;
  String result = "" ;
  while ( i >= 0 ) {
    if ( str . charAt ( i ) == ' ' ) {
      start = i + 1 ;
      while ( start != end ) result += str . charAt ( start ++ ) ;
      result += ' ' ;
      end = i ;
    }
    i -- ;
  }
  start = 0 ;
  while ( start != end ) result += str . charAt ( start ++ ) ;
  return result ;
}


//TOFILL

}
