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
public class COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int invcount = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int small = 0 ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) if ( arr [ i ] > arr [ j ] ) small ++ ;
    int great = 0 ;
    for ( int j = i - 1 ;
    j >= 0 ;
    j -- ) if ( arr [ i ] < arr [ j ] ) great ++ ;
    invcount += great * small ;
  }
  return invcount ;
}


//TOFILL

}
