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
public class FIND_DIFFERENCE_BETWEEN_SUMS_OF_TWO_DIAGONALS_1{
public static int f_gold ( int arr [ ] [ ] , int n ) {
  int d1 = 0 , d2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d1 += arr [ i ] [ i ] ;
    d2 += arr [ i ] [ n - i - 1 ] ;
  }
  return Math . abs ( d1 - d2 ) ;
}


//TOFILL

}
