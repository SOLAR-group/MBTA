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
public class MINIMUM_NUMBER_OF_JUMPS_TO_REACH_END_OF_A_GIVEN_ARRAY_2{
static int f_gold ( int arr [ ] , int n ) {
  int [ ] jumps = new int [ n ] ;
  int min ;
  jumps [ n - 1 ] = 0 ;
  for ( int i = n - 2 ;
  i >= 0 ;
  i -- ) {
    if ( arr [ i ] == 0 ) jumps [ i ] = Integer . MAX_VALUE ;
    else if ( arr [ i ] >= n - i - 1 ) jumps [ i ] = 1 ;
    else {
      min = Integer . MAX_VALUE ;
      for ( int j = i + 1 ;
      j < n && j <= arr [ i ] + i ;
      j ++ ) {
        if ( min > jumps [ j ] ) min = jumps [ j ] ;
      }
      if ( min != Integer . MAX_VALUE ) jumps [ i ] = min + 1 ;
      else jumps [ i ] = min ;
    }
  }
  return jumps [ 0 ] ;
}


//TOFILL

}
