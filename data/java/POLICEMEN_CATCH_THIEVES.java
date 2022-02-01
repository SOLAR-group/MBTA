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
public class POLICEMEN_CATCH_THIEVES{
static int f_gold ( char arr [ ] , int n , int k ) {
  int res = 0 ;
  ArrayList < Integer > thi = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > pol = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] == 'P' ) pol . add ( i ) ;
    else if ( arr [ i ] == 'T' ) thi . add ( i ) ;
  }
  int l = 0 , r = 0 ;
  while ( l < thi . size ( ) && r < pol . size ( ) ) {
    if ( Math . abs ( thi . get ( l ) - pol . get ( r ) ) <= k ) {
      res ++ ;
      l ++ ;
      r ++ ;
    }
    else if ( thi . get ( l ) < pol . get ( r ) ) l ++ ;
    else r ++ ;
  }
  return res ;
}


//TOFILL

}
