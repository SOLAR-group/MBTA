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
public class WAYS_REMOVE_ONE_ELEMENT_BINARY_STRING_XOR_BECOMES_ZERO{
static int f_gold ( String s ) {
  int one_count = 0 , zero_count = 0 ;
  char [ ] str = s . toCharArray ( ) ;
  int n = str . length ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( str [ i ] == '1' ) one_count ++ ;
  else zero_count ++ ;
  if ( one_count % 2 == 0 ) return zero_count ;
  return one_count ;
}


//TOFILL

}