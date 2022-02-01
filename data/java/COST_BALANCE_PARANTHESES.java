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
public class COST_BALANCE_PARANTHESES{
static int f_gold ( String s ) {
  if ( s . length ( ) == 0 ) System . out . println ( 0 ) ;
  int ans = 0 ;
  int o = 0 , c = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '(' ) o ++ ;
    if ( s . charAt ( i ) == ')' ) c ++ ;
  }
  if ( o != c ) return - 1 ;
  int [ ] a = new int [ s . length ( ) ] ;
  if ( s . charAt ( 0 ) == '(' ) a [ 0 ] = 1 ;
  else a [ 0 ] = - 1 ;
  if ( a [ 0 ] < 0 ) ans += Math . abs ( a [ 0 ] ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '(' ) a [ i ] = a [ i - 1 ] + 1 ;
    else a [ i ] = a [ i - 1 ] - 1 ;
    if ( a [ i ] < 0 ) ans += Math . abs ( a [ i ] ) ;
  }
  return ans ;
}


//TOFILL

}
