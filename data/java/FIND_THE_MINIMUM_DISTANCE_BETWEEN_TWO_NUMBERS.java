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
public class FIND_THE_MINIMUM_DISTANCE_BETWEEN_TWO_NUMBERS{
static int f_gold ( int arr [ ] , int n , int x , int y ) {
  int i , j ;
  int min_dist = Integer . MAX_VALUE ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( ( x == arr [ i ] && y == arr [ j ] || y == arr [ i ] && x == arr [ j ] ) && min_dist > Math . abs ( i - j ) ) min_dist = Math . abs ( i - j ) ;
    }
  }
  return min_dist ;
}


//TOFILL

}
