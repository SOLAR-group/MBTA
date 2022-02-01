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
public class CONSTRUCT_LEXICOGRAPHICALLY_SMALLEST_PALINDROME{
static String f_gold ( char [ ] str , int len ) {
  int i = 0 , j = len - 1 ;
  for ( ;
  i < j ;
  i ++ , j -- ) {
    if ( str [ i ] == str [ j ] && str [ i ] != '*' ) continue ;
    else if ( str [ i ] == str [ j ] && str [ i ] == '*' ) {
      str [ i ] = 'a' ;
      str [ j ] = 'a' ;
      continue ;
    }
    else if ( str [ i ] == '*' ) {
      str [ i ] = str [ j ] ;
      continue ;
    }
    else if ( str [ j ] == '*' ) {
      str [ j ] = str [ i ] ;
      continue ;
    }
    System . out . println ( "Not Possible" ) ;
    return "" ;
  }
  return String . valueOf ( str ) ;
}


//TOFILL

}
