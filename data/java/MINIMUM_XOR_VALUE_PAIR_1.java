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
public class MINIMUM_XOR_VALUE_PAIR_1{
static int f_gold ( int arr [ ] , int n ) {
  Arrays . parallelSort ( arr ) ;
  int minXor = Integer . MAX_VALUE ;
  int val = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    val = arr [ i ] ^ arr [ i + 1 ] ;
    minXor = Math . min ( minXor , val ) ;
  }
  return minXor ;
}


//TOFILL

}
