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
public class PRINT_A_CLOSEST_STRING_THAT_DOES_NOT_CONTAIN_ADJACENT_DUPLICATES{
public static String f_gold ( String s1 ) {
  int n = s1 . length ( ) ;
  char [ ] s = s1 . toCharArray ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s [ i ] == s [ i - 1 ] ) {
      s [ i ] = 'a' ;
      while ( s [ i ] == s [ i - 1 ] || ( i + 1 < n && s [ i ] == s [ i + 1 ] ) ) s [ i ] ++ ;
      i ++ ;
    }
  }
  return ( new String ( s ) ) ;
}


//TOFILL

}
