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
public class NON_REPEATING_ELEMENT{
static int f_gold ( int arr [ ] , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j ;
    for ( j = 0 ;
    j < n ;
    j ++ ) if ( i != j && arr [ i ] == arr [ j ] ) break ;
    if ( j == n ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
