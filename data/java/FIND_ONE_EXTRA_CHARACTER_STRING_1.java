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
public class FIND_ONE_EXTRA_CHARACTER_STRING_1{
static char f_gold ( String strA , String strB ) {
  int res = 0 , i ;
  for ( i = 0 ;
  i < strA . length ( ) ;
  i ++ ) {
    res ^= strA . charAt ( i ) ;
  }
  for ( i = 0 ;
  i < strB . length ( ) ;
  i ++ ) {
    res ^= strB . charAt ( i ) ;
  }
  return ( ( char ) ( res ) ) ;
}


//TOFILL

}
