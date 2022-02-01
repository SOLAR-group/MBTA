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
public class FIND_NUMBER_ENDLESS_POINTS{
static int f_gold ( boolean input [ ] [ ] , int n ) {
  boolean row [ ] [ ] = new boolean [ n ] [ n ] ;
  boolean col [ ] [ ] = new boolean [ n ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    boolean isEndless = true ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      if ( input [ i ] [ j ] == false ) isEndless = false ;
      col [ i ] [ j ] = isEndless ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    boolean isEndless = true ;
    for ( int j = n - 1 ;
    j >= 0 ;
    j -- ) {
      if ( input [ i ] [ j ] == false ) isEndless = false ;
      row [ i ] [ j ] = isEndless ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 1 ;
  j < n ;
  j ++ ) if ( row [ i ] [ j ] && col [ i ] [ j ] ) ans ++ ;
  return ans ;
}


//TOFILL

}
