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
public class SCHEDULE_JOBS_SERVER_GETS_EQUAL_LOAD{
static int f_gold ( int a [ ] , int b [ ] , int n ) {
  int i ;
  int s = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) s += ( a [ i ] + b [ i ] ) ;
  if ( n == 1 ) return a [ 0 ] + b [ 0 ] ;
  if ( s % n != 0 ) return - 1 ;
  int x = s / n ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > x ) return - 1 ;
    if ( i > 0 ) {
      a [ i ] += b [ i - 1 ] ;
      b [ i - 1 ] = 0 ;
    }
    if ( a [ i ] == x ) continue ;
    int y = a [ i ] + b [ i ] ;
    if ( i + 1 < n ) y += b [ i + 1 ] ;
    if ( y == x ) {
      a [ i ] = y ;
      b [ i ] = 0 ;
      continue ;
    }
    if ( a [ i ] + b [ i ] == x ) {
      a [ i ] += b [ i ] ;
      b [ i ] = 0 ;
      continue ;
    }
    if ( i + 1 < n && a [ i ] + b [ i + 1 ] == x ) {
      a [ i ] += b [ i + 1 ] ;
      b [ i + 1 ] = 0 ;
      continue ;
    }
    return - 1 ;
  }
  for ( i = 0 ;
  i < n ;
  i ++ ) if ( b [ i ] != 0 ) return - 1 ;
  return x ;
}


//TOFILL

}
