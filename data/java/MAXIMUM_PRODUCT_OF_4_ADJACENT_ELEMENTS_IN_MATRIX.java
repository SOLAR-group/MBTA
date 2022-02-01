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
public class MAXIMUM_PRODUCT_OF_4_ADJACENT_ELEMENTS_IN_MATRIX{
static int f_gold ( int arr [ ] [ ] , int n ) {
  int max = 0 , result ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( j - 3 ) >= 0 ) {
        result = arr [ i ] [ j ] * arr [ i ] [ j - 1 ] * arr [ i ] [ j - 2 ] * arr [ i ] [ j - 3 ] ;
        if ( max < result ) max = result ;
      }
      if ( ( i - 3 ) >= 0 ) {
        result = arr [ i ] [ j ] * arr [ i - 1 ] [ j ] * arr [ i - 2 ] [ j ] * arr [ i - 3 ] [ j ] ;
        if ( max < result ) max = result ;
      }
      if ( ( i - 3 ) >= 0 && ( j - 3 ) >= 0 ) {
        result = arr [ i ] [ j ] * arr [ i - 1 ] [ j - 1 ] * arr [ i - 2 ] [ j - 2 ] * arr [ i - 3 ] [ j - 3 ] ;
        if ( max < result ) max = result ;
      }
    }
  }
  return max ;
}


//TOFILL

}
