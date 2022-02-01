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
public class LOWER_CASE_UPPER_CASE_INTERESTING_FACT{
static String f_gold ( char [ ] in ) {
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    if ( 'a' <= in [ i ] & in [ i ] <= 'z' ) {
      in [ i ] = ( char ) ( in [ i ] - 'a' + 'A' ) ;
    }
  }
  return String . valueOf ( in ) ;
}


//TOFILL

}
