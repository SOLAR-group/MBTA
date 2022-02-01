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
public class LOWER_INSERTION_POINT{
static int f_gold ( int arr [ ] , int n , int X ) {
  if ( X < arr [ 0 ] ) return 0 ;
  else if ( X > arr [ n - 1 ] ) return n ;
  int lowerPnt = 0 ;
  int i = 1 ;
  while ( i < n && arr [ i ] < X ) {
    lowerPnt = i ;
    i = i * 2 ;
  }
  while ( lowerPnt < n && arr [ lowerPnt ] < X ) lowerPnt ++ ;
  return lowerPnt ;
}


//TOFILL

}
