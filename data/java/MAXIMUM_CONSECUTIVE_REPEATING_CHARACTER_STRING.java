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
public class MAXIMUM_CONSECUTIVE_REPEATING_CHARACTER_STRING{
static char f_gold ( String str ) {
  int len = str . length ( ) ;
  int count = 0 ;
  char res = str . charAt ( 0 ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    int cur_count = 1 ;
    for ( int j = i + 1 ;
    j < len ;
    j ++ ) {
      if ( str . charAt ( i ) != str . charAt ( j ) ) break ;
      cur_count ++ ;
    }
    if ( cur_count > count ) {
      count = cur_count ;
      res = str . charAt ( i ) ;
    }
  }
  return res ;
}


//TOFILL

}
