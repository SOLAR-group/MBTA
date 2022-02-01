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
public class FIND_PAIR_MAXIMUM_GCD_ARRAY{
public static int f_gold ( int arr [ ] , int n ) {
  int high = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) high = Math . max ( high , arr [ i ] ) ;
  int divisors [ ] = new int [ high + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= Math . sqrt ( arr [ i ] ) ;
    j ++ ) {
      if ( arr [ i ] % j == 0 ) {
        divisors [ j ] ++ ;
        if ( j != arr [ i ] / j ) divisors [ arr [ i ] / j ] ++ ;
      }
    }
  }
  for ( int i = high ;
  i >= 1 ;
  i -- ) if ( divisors [ i ] > 1 ) return i ;
  return 1 ;
}


//TOFILL

}
