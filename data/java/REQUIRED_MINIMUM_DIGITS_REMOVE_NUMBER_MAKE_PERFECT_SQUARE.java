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
public class REQUIRED_MINIMUM_DIGITS_REMOVE_NUMBER_MAKE_PERFECT_SQUARE{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int ans = - 1 ;
  String num = "" ;
  for ( int i = 1 ;
  i < ( 1 << n ) ;
  i ++ ) {
    String str = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        str += s . charAt ( j ) ;
      }
    }
    if ( str . charAt ( 0 ) != '0' ) {
      int temp = 0 ;
      for ( int j = 0 ;
      j < str . length ( ) ;
      j ++ ) temp = temp * 10 + ( int ) ( str . charAt ( j ) - '0' ) ;
      int k = ( int ) Math . sqrt ( temp ) ;
      if ( k * k == temp ) {
        if ( ans < ( int ) str . length ( ) ) {
          ans = ( int ) str . length ( ) ;
          num = str ;
        }
      }
    }
  }
  if ( ans == - 1 ) return ans ;
  else {
    System . out . print ( num + " " ) ;
    return n - ans ;
  }
}


//TOFILL

}
