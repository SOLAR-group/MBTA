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
public class EQUILIBRIUM_INDEX_OF_AN_ARRAY_1{
static int f_gold ( int arr [ ] , int n ) {
  int sum = 0 ;
  int leftsum = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) sum += arr [ i ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    sum -= arr [ i ] ;
    if ( leftsum == sum ) return i ;
    leftsum += arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
