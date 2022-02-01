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
public class DECODE_MEDIAN_STRING_ORIGINAL_STRING{
static String f_gold ( String s ) {
  int l = s . length ( ) ;
  String s1 = "" ;
  boolean isEven = ( l % 2 == 0 ) ? true : false ;
  for ( int i = 0 ;
  i < l ;
  i += 2 ) {
    if ( isEven ) {
      s1 = s . charAt ( i ) + s1 ;
      s1 += s . charAt ( i + 1 ) ;
    }
    else {
      if ( l - i > 1 ) {
        s1 += s . charAt ( i ) ;
        s1 = s . charAt ( i + 1 ) + s1 ;
      }
      else {
        s1 += s . charAt ( i ) ;
      }
    }
  }
  return s1 ;
}


//TOFILL

}
