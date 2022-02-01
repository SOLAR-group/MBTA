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
public class LONGEST_PREFIX_ALSO_SUFFIX_1{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int lps [ ] = new int [ n ] ;
  lps [ 0 ] = 0 ;
  int len = 0 ;
  int i = 1 ;
  while ( i < n ) {
    if ( s . charAt ( i ) == s . charAt ( len ) ) {
      len ++ ;
      lps [ i ] = len ;
      i ++ ;
    }
    else {
      if ( len != 0 ) {
        len = lps [ len - 1 ] ;
      }
      else {
        lps [ i ] = 0 ;
        i ++ ;
      }
    }
  }
  int res = lps [ n - 1 ] ;
  return ( res > n / 2 ) ? n / 2 : res ;
}


//TOFILL

}
