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
public class LENGTH_OF_THE_LONGEST_ARITHMATIC_PROGRESSION_IN_A_SORTED_ARRAY{
static int f_gold ( int set [ ] , int n ) {
  if ( n <= 2 ) return n ;
  int L [ ] [ ] = new int [ n ] [ n ] ;
  int llap = 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) L [ i ] [ n - 1 ] = 2 ;
  for ( int j = n - 2 ;
  j >= 1 ;
  j -- ) {
    int i = j - 1 , k = j + 1 ;
    while ( i >= 0 && k <= n - 1 ) {
      if ( set [ i ] + set [ k ] < 2 * set [ j ] ) k ++ ;
      else if ( set [ i ] + set [ k ] > 2 * set [ j ] ) {
        L [ i ] [ j ] = 2 ;
        i -- ;
      }
      else {
        L [ i ] [ j ] = L [ j ] [ k ] + 1 ;
        llap = Math . max ( llap , L [ i ] [ j ] ) ;
        i -- ;
        k ++ ;
      }
    }
    while ( i >= 0 ) {
      L [ i ] [ j ] = 2 ;
      i -- ;
    }
  }
  return llap ;
}


//TOFILL

}
