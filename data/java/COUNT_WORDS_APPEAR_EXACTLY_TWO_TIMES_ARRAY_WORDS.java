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
public class COUNT_WORDS_APPEAR_EXACTLY_TWO_TIMES_ARRAY_WORDS{
static int f_gold ( String str [ ] , int n ) {
  HashMap < String , Integer > m = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( m . containsKey ( str [ i ] ) ) {
      int get = m . get ( str [ i ] ) ;
      m . put ( str [ i ] , get + 1 ) ;
    }
    else {
      m . put ( str [ i ] , 1 ) ;
    }
  }
  int res = 0 ;
  for ( Map . Entry < String , Integer > it : m . entrySet ( ) ) {
    if ( it . getValue ( ) == 2 ) res ++ ;
  }
  return res ;
}


//TOFILL

}
