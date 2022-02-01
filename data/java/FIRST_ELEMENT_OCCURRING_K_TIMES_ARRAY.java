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
public class FIRST_ELEMENT_OCCURRING_K_TIMES_ARRAY{
static int f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > count_map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = 0 ;
    if ( count_map . get ( arr [ i ] ) != null ) {
      a = count_map . get ( arr [ i ] ) ;
    }
    count_map . put ( arr [ i ] , a + 1 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( count_map . get ( arr [ i ] ) == k ) {
      return arr [ i ] ;
    }
  }
  return - 1 ;
}


//TOFILL

}
