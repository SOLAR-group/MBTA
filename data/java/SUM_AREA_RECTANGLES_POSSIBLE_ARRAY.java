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
public class SUM_AREA_RECTANGLES_POSSIBLE_ARRAY{
static int f_gold ( int [ ] a , int n ) {
  Arrays . sort ( a ) ;
  int sum = 0 ;
  boolean flag = false ;
  int len = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] == a [ i + 1 ] || a [ i ] - a [ i + 1 ] == 1 ) && ! flag ) {
      flag = true ;
      len = a [ i + 1 ] ;
      i ++ ;
    }
    else if ( ( a [ i ] == a [ i + 1 ] || a [ i ] - a [ i + 1 ] == 1 ) && ( flag ) ) {
      sum = sum + a [ i + 1 ] * len ;
      flag = false ;
      i ++ ;
    }
  }
  return sum ;
}


//TOFILL

}
