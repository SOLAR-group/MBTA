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
public class CHECK_ARRAY_CONTAINS_CONTIGUOUS_INTEGERS_DUPLICATES_ALLOWED{
static boolean f_gold ( int arr [ ] , int n ) {
  int max = Integer . MIN_VALUE ;
  int min = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    max = Math . max ( max , arr [ i ] ) ;
    min = Math . min ( min , arr [ i ] ) ;
  }
  int m = max - min + 1 ;
  if ( m > n ) return false ;
  boolean visited [ ] = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) visited [ arr [ i ] - min ] = true ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) if ( visited [ i ] == false ) return false ;
  return true ;
}


//TOFILL

}
