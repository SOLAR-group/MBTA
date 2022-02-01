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
public class PARTITION_INTO_TWO_SUBARRAYS_OF_LENGTHS_K_AND_N_K_SUCH_THAT_THE_DIFFERENCE_OF_SUMS_IS_MAXIMUM{
static int f_gold ( int arr [ ] , int N , int k ) {
  int M , S = 0 , S1 = 0 , max_difference = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S += arr [ i ] ;
  int temp ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( arr [ i ] < arr [ j ] ) {
        temp = arr [ i ] ;
        arr [ i ] = arr [ j ] ;
        arr [ j ] = temp ;
      }
    }
  }
  M = Math . max ( k , N - k ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) S1 += arr [ i ] ;
  max_difference = S1 - ( S - S1 ) ;
  return max_difference ;
}


//TOFILL

}
