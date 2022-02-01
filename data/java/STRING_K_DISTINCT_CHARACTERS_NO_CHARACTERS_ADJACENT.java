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
public class STRING_K_DISTINCT_CHARACTERS_NO_CHARACTERS_ADJACENT{
static String f_gold ( int n , int k ) {
  String res = "" ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) res = res + ( char ) ( 'a' + i ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n - k ;
  i ++ ) {
    res = res + ( char ) ( 'a' + count ) ;
    count ++ ;
    if ( count == k ) count = 0 ;
  }
  return res ;
}


//TOFILL

}
