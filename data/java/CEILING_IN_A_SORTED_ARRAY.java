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
public class CEILING_IN_A_SORTED_ARRAY{
static int f_gold ( int arr [ ] , int low , int high , int x ) {
  int i ;
  if ( x <= arr [ low ] ) return low ;
  for ( i = low ;
  i < high ;
  i ++ ) {
    if ( arr [ i ] == x ) return i ;
    if ( arr [ i ] < x && arr [ i + 1 ] >= x ) return i + 1 ;
  }
  return - 1 ;
}


//TOFILL

}
