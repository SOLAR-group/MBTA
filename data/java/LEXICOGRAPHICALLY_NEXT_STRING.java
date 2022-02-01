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
public class LEXICOGRAPHICALLY_NEXT_STRING{
public static String f_gold ( String str ) {
  if ( str == "" ) return "a" ;
  int i = str . length ( ) - 1 ;
  while ( str . charAt ( i ) == 'z' && i >= 0 ) i -- ;
  if ( i == - 1 ) str = str + 'a' ;
  else str = str . substring ( 0 , i ) + ( char ) ( ( int ) ( str . charAt ( i ) ) + 1 ) + str . substring ( i + 1 ) ;
  return str ;
}


//TOFILL

}
