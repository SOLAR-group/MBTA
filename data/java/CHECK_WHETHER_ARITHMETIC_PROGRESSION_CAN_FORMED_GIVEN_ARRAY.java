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
public class CHECK_WHETHER_ARITHMETIC_PROGRESSION_CAN_FORMED_GIVEN_ARRAY{
static boolean f_gold ( int arr [ ] , int n ) {
  if ( n == 1 ) return true ;
  Arrays . sort ( arr ) ;
  int d = arr [ 1 ] - arr [ 0 ] ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) if ( arr [ i ] - arr [ i - 1 ] != d ) return false ;
  return true ;
}


//TOFILL

}
