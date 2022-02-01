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
public class REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S{
static String f_gold ( String s , char c1 , char c2 ) {
  int l = s . length ( ) ;
  char [ ] arr = s . toCharArray ( ) ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    if ( arr [ i ] == c1 ) arr [ i ] = c2 ;
    else if ( arr [ i ] == c2 ) arr [ i ] = c1 ;
  }
  return String . valueOf ( arr ) ;
}


//TOFILL

}
