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
public class MAXIMUM_SUM_SUBSEQUENCE_LEAST_K_DISTANT_ELEMENTS{
static int f_gold ( int arr [ ] , int N , int k ) {
  int MS [ ] = new int [ N ] ;
  MS [ N - 1 ] = arr [ N - 1 ] ;
  for ( int i = N - 2 ;
  i >= 0 ;
  i -- ) {
    if ( i + k + 1 >= N ) MS [ i ] = Math . max ( arr [ i ] , MS [ i + 1 ] ) ;
    else MS [ i ] = Math . max ( arr [ i ] + MS [ i + k + 1 ] , MS [ i + 1 ] ) ;
  }
  return MS [ 0 ] ;
}


//TOFILL

}
