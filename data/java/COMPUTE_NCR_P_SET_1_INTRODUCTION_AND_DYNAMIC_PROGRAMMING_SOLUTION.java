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
public class COMPUTE_NCR_P_SET_1_INTRODUCTION_AND_DYNAMIC_PROGRAMMING_SOLUTION{
static int f_gold ( int n , int r , int p ) {
  int C [ ] = new int [ r + 1 ] ;
  Arrays . fill ( C , 0 ) ;
  C [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = Math . min ( i , r ) ;
    j > 0 ;
    j -- ) C [ j ] = ( C [ j ] + C [ j - 1 ] ) % p ;
  }
  return C [ r ] ;
}


//TOFILL

}
