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
public class MINIMUM_COST_SORT_MATRIX_NUMBERS_0_N2_1{
public static int f_gold ( int mat [ ] [ ] , int n ) {
  int i_des , j_des , q ;
  int tot_energy = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      q = mat [ i ] [ j ] / n ;
      i_des = q ;
      j_des = mat [ i ] [ j ] - ( n * q ) ;
      tot_energy += Math . abs ( i_des - i ) + Math . abs ( j_des - j ) ;
    }
  }
  return tot_energy ;
}


//TOFILL

}
