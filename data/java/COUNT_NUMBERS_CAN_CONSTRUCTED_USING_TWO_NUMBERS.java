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
public class COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS{
static int f_gold ( int n , int x , int y ) {
  boolean [ ] arr = new boolean [ n + 1 ] ;
  if ( x <= n ) arr [ x ] = true ;
  if ( y <= n ) arr [ y ] = true ;
  int result = 0 ;
  for ( int i = Math . min ( x , y ) ;
  i <= n ;
  i ++ ) {
    if ( arr [ i ] ) {
      if ( i + x <= n ) arr [ i + x ] = true ;
      if ( i + y <= n ) arr [ i + y ] = true ;
      result ++ ;
    }
  }
  return result ;
}


//TOFILL

}
