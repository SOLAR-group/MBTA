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
public class CONVERT_STRICTLY_INCREASING_ARRAY_MINIMUM_CHANGES{
static int f_gold ( int arr [ ] , int n ) {
  int LIS [ ] = new int [ n ] ;
  int len = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) LIS [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( arr [ i ] > arr [ j ] && ( i - j ) <= ( arr [ i ] - arr [ j ] ) ) LIS [ i ] = Math . max ( LIS [ i ] , LIS [ j ] + 1 ) ;
    }
    len = Math . max ( len , LIS [ i ] ) ;
  }
  return n - len ;
}


//TOFILL

}
