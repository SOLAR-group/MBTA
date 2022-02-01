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
public class POSITION_ELEMENT_STABLE_SORT{
static int f_gold ( int arr [ ] , int n , int idx ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( arr [ i ] < arr [ idx ] ) result ++ ;
    if ( arr [ i ] == arr [ idx ] && i < idx ) result ++ ;
  }
  return result ;
}


//TOFILL

}
