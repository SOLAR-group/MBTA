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
public class COUNT_CHARACTERS_POSITION_ENGLISH_ALPHABETS{
static int f_gold ( String str ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  i ++ ) {
    if ( i == ( str . charAt ( i ) - 'a' ) || i == ( str . charAt ( i ) - 'A' ) ) {
      result ++ ;
    }
  }
  return result ;
}


//TOFILL

}
