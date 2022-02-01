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
class CHANGE_ARRAY_PERMUTATION_NUMBERS_1_N{
static void f_gold ( int [ ] a , int n ) {
  HashMap < Integer , Integer > count = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count . containsKey ( a [ i ] ) ) {
      count . put ( a [ i ] , count . get ( a [ i ] ) + 1 ) ;
    }
    else {
      count . put ( a [ i ] , 1 ) ;
    }
  }
  int next_missing = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count . containsKey ( a [ i ] ) && count . get ( a [ i ] ) != 1 || a [ i ] > n || a [ i ] < 1 ) {
      count . put ( a [ i ] , count . get ( a [ i ] ) - 1 ) ;
      while ( count . containsKey ( next_missing ) ) next_missing ++ ;
      a [ i ] = next_missing ;
      count . put ( next_missing , 1 ) ;
    }
  }
}


//TOFILL

}
