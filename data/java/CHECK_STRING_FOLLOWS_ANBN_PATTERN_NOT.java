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
public class CHECK_STRING_FOLLOWS_ANBN_PATTERN_NOT{
public static boolean f_gold ( String s ) {
  int l = s . length ( ) ;
  if ( l % 2 == 1 ) {
    return false ;
  }
  int i = 0 ;
  int j = l - 1 ;
  while ( i < j ) {
    if ( s . charAt ( i ) != 'a' || s . charAt ( j ) != 'b' ) {
      return false ;
    }
    i ++ ;
    j -- ;
  }
  return true ;
}


//TOFILL

}
