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
public class LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION{
static String f_gold ( String str ) {
  int n = str . length ( ) ;
  String arr [ ] = new String [ n ] ;
  String concat = str + str ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = concat . substring ( i , i + n ) ;
  }
  Arrays . sort ( arr ) ;
  return arr [ 0 ] ;
}


//TOFILL

}
