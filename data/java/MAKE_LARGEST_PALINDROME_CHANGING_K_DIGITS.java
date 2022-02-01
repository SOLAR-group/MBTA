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
public class MAKE_LARGEST_PALINDROME_CHANGING_K_DIGITS{
static String f_gold ( String str , int k ) {
  char palin [ ] = str . toCharArray ( ) ;
  String ans = "" ;
  int l = 0 ;
  int r = str . length ( ) - 1 ;
  while ( l < r ) {
    if ( str . charAt ( l ) != str . charAt ( r ) ) {
      palin [ l ] = palin [ r ] = ( char ) Math . max ( str . charAt ( l ) , str . charAt ( r ) ) ;
      k -- ;
    }
    l ++ ;
    r -- ;
  }
  if ( k < 0 ) {
    return "Not possible" ;
  }
  l = 0 ;
  r = str . length ( ) - 1 ;
  while ( l <= r ) {
    if ( l == r ) {
      if ( k > 0 ) {
        palin [ l ] = '9' ;
      }
    }
    if ( palin [ l ] < '9' ) {
      if ( k >= 2 && palin [ l ] == str . charAt ( l ) && palin [ r ] == str . charAt ( r ) ) {
        k -= 2 ;
        palin [ l ] = palin [ r ] = '9' ;
      }
      else if ( k >= 1 && ( palin [ l ] != str . charAt ( l ) || palin [ r ] != str . charAt ( r ) ) ) {
        k -- ;
        palin [ l ] = palin [ r ] = '9' ;
      }
    }
    l ++ ;
    r -- ;
  }
  for ( int i = 0 ;
  i < palin . length ;
  i ++ ) ans += palin [ i ] ;
  return ans ;
}


//TOFILL

}
