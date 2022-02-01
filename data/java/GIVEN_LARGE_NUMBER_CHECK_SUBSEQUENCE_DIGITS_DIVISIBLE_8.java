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
public class GIVEN_LARGE_NUMBER_CHECK_SUBSEQUENCE_DIGITS_DIVISIBLE_8{
static boolean f_gold ( String str ) {
  int i , j , k , l = str . length ( ) ;
  int arr [ ] = new int [ l ] ;
  for ( i = 0 ;
  i < l ;
  i ++ ) {
    for ( j = i ;
    j < l ;
    j ++ ) {
      for ( k = j ;
      k < l ;
      k ++ ) {
        if ( arr [ i ] % 8 == 0 ) return true ;
        else if ( ( arr [ i ] * 10 + arr [ j ] ) % 8 == 0 && i != j ) return true ;
        else if ( ( arr [ i ] * 100 + arr [ j ] * 10 + arr [ k ] ) % 8 == 0 && i != j && j != k && i != k ) return true ;
      }
    }
  }
  return false ;
}


//TOFILL

}
