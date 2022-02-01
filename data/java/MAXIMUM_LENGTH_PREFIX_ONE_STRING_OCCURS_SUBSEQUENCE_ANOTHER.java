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
public class MAXIMUM_LENGTH_PREFIX_ONE_STRING_OCCURS_SUBSEQUENCE_ANOTHER{
static int f_gold ( String s , String t ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    if ( count == t . length ( ) ) break ;
    if ( t . charAt ( i ) == s . charAt ( count ) ) count ++ ;
  }
  return count ;
}


//TOFILL

}
