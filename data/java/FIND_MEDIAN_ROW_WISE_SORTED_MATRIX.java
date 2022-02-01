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
public class FIND_MEDIAN_ROW_WISE_SORTED_MATRIX{
static int f_gold ( int m [ ] [ ] , int r , int c ) {
  int max = Integer . MIN_VALUE ;
  int min = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( m [ i ] [ 0 ] < min ) min = m [ i ] [ 0 ] ;
    if ( m [ i ] [ c - 1 ] > max ) max = m [ i ] [ c - 1 ] ;
  }
  int desired = ( r * c + 1 ) / 2 ;
  while ( min < max ) {
    int mid = min + ( max - min ) / 2 ;
    int place = 0 ;
    int get = 0 ;
    for ( int i = 0 ;
    i < r ;
    ++ i ) {
      get = Arrays . binarySearch ( m [ i ] , mid ) ;
      if ( get < 0 ) get = Math . abs ( get ) - 1 ;
      else {
        while ( get < m [ i ] . length && m [ i ] [ get ] == mid ) get += 1 ;
      }
      place = place + get ;
    }
    if ( place < desired ) min = mid + 1 ;
    else max = mid ;
  }
  return min ;
}


//TOFILL

}
