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
public class WAYS_TO_WRITE_N_AS_SUM_OF_TWO_OR_MORE_POSITIVE_INTEGERS{
static int f_gold ( int n ) {
  int table [ ] = new int [ n + 1 ] ;
  Arrays . fill ( table , 0 ) ;
  table [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = i ;
  j <= n ;
  j ++ ) table [ j ] += table [ j - i ] ;
  return table [ n ] ;
}


//TOFILL

}
