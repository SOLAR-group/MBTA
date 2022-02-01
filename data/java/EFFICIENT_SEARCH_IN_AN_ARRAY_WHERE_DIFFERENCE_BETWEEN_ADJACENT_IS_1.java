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
public class EFFICIENT_SEARCH_IN_AN_ARRAY_WHERE_DIFFERENCE_BETWEEN_ADJACENT_IS_1{
static int f_gold ( int arr [ ] , int n , int x ) {
  int i = 0 ;
  while ( i <= n - 1 ) {
    if ( arr [ i ] == x ) return i ;
    i += Math . abs ( arr [ i ] - x ) ;
  }
  return - 1 ;
}


//TOFILL

}
