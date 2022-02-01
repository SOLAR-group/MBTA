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
public class EQUILIBRIUM_INDEX_OF_AN_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int i , j ;
  int leftsum , rightsum ;
  for ( i = 0 ;
  i < n ;
  ++ i ) {
    leftsum = 0 ;
    for ( j = 0 ;
    j < i ;
    j ++ ) leftsum += arr [ j ] ;
    rightsum = 0 ;
    for ( j = i + 1 ;
    j < n ;
    j ++ ) rightsum += arr [ j ] ;
    if ( leftsum == rightsum ) return i ;
  }
  return - 1 ;
}


//TOFILL

}
