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
public class CHECK_VALID_SEQUENCE_DIVISIBLE_M_1{
static int f_gold ( int n , int index , int modulo , int M , int arr [ ] , int dp [ ] [ ] ) {
  modulo = ( ( modulo % M ) + M ) % M ;
  if ( index == n ) {
    if ( modulo == 0 ) {
      return 1 ;
    }
    return 0 ;
  }
  if ( dp [ index ] [ modulo ] != - 1 ) {
    return dp [ index ] [ modulo ] ;
  }
  int placeAdd = f_gold ( n , index + 1 , modulo + arr [ index ] , M , arr , dp ) ;
  int placeMinus = f_gold ( n , index + 1 , modulo - arr [ index ] , M , arr , dp ) ;
  int res = placeAdd ;
  dp [ index ] [ modulo ] = res ;
  return res ;
}


//TOFILL

}
