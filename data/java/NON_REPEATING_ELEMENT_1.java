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
public class NON_REPEATING_ELEMENT_1{
static int f_gold ( int arr [ ] , int n ) {
  Map < Integer , Integer > m = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( m . containsKey ( arr [ i ] ) ) {
      m . put ( arr [ i ] , m . get ( arr [ i ] ) + 1 ) ;
    }
    else {
      m . put ( arr [ i ] , 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( m . get ( arr [ i ] ) == 1 ) return arr [ i ] ;
  return - 1 ;
}


//TOFILL

}
