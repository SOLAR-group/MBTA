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
public class DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD{
static int f_gold ( int price [ ] , int n ) {
  int val [ ] = new int [ n + 1 ] ;
  val [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int max_val = Integer . MIN_VALUE ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) max_val = Math . max ( max_val , price [ j ] + val [ i - j - 1 ] ) ;
    val [ i ] = max_val ;
  }
  return val [ n ] ;
}


//TOFILL

}
