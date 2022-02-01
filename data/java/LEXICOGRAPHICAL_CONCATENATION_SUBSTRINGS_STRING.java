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
public class LEXICOGRAPHICAL_CONCATENATION_SUBSTRINGS_STRING{
static String f_gold ( String s ) {
  int n = s . length ( ) ;
  int sub_count = n * ( n + 1 ) / 2 ;
  String [ ] arr = new String [ sub_count ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int len = 1 ;
  len <= n - i ;
  len ++ ) {
    arr [ index ++ ] = s . substring ( i , i + len ) ;
  }
  Arrays . sort ( arr ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < sub_count ;
  i ++ ) res += arr [ i ] ;
  return res ;
}


//TOFILL

}
