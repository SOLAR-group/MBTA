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
public class MINIMUM_CHARACTERS_ADDED_FRONT_MAKE_STRING_PALINDROME{
static boolean f_gold ( String s ) {
  int l = s . length ( ) ;
  for ( int i = 0 , j = l - 1 ;
  i <= j ;
  i ++ , j -- ) {
    if ( s . charAt ( i ) != s . charAt ( j ) ) {
      return false ;
    }
  }
  return true ;
}


//TOFILL

}
