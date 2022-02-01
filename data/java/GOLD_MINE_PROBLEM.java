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
public class GOLD_MINE_PROBLEM{
static int f_gold ( int gold [ ] [ ] , int m , int n ) {
  int goldTable [ ] [ ] = new int [ m ] [ n ] ;
  for ( int [ ] rows : goldTable ) Arrays . fill ( rows , 0 ) ;
  for ( int col = n - 1 ;
  col >= 0 ;
  col -- ) {
    for ( int row = 0 ;
    row < m ;
    row ++ ) {
      int right = ( col == n - 1 ) ? 0 : goldTable [ row ] [ col + 1 ] ;
      int right_up = ( row == 0 || col == n - 1 ) ? 0 : goldTable [ row - 1 ] [ col + 1 ] ;
      int right_down = ( row == m - 1 || col == n - 1 ) ? 0 : goldTable [ row + 1 ] [ col + 1 ] ;
      goldTable [ row ] [ col ] = gold [ row ] [ col ] + Math . max ( right , Math . max ( right_up , right_down ) ) ;
      ;
    }
  }
  int res = goldTable [ 0 ] [ 0 ] ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) res = Math . max ( res , goldTable [ i ] [ 0 ] ) ;
  return res ;
}


//TOFILL

}
