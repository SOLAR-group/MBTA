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
public class PANGRAM_CHECKING{
public static boolean f_gold ( String str ) {
  boolean [ ] mark = new boolean [ 26 ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( 'A' <= str . charAt ( i ) && str . charAt ( i ) <= 'Z' ) index = str . charAt ( i ) - 'A' ;
    else if ( 'a' <= str . charAt ( i ) && str . charAt ( i ) <= 'z' ) index = str . charAt ( i ) - 'a' ;
    mark [ index ] = true ;
  }
  for ( int i = 0 ;
  i <= 25 ;
  i ++ ) if ( mark [ i ] == false ) return ( false ) ;
  return ( true ) ;
}


//TOFILL

}
