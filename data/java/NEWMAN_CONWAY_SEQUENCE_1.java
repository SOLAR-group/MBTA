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
public class NEWMAN_CONWAY_SEQUENCE_1{
static int f_gold ( int n ) {
  int f [ ] = new int [ n + 1 ] ;
  f [ 0 ] = 0 ;
  f [ 1 ] = 1 ;
  f [ 2 ] = 1 ;
  int i ;
  for ( i = 3 ;
  i <= n ;
  i ++ ) f [ i ] = f [ f [ i - 1 ] ] + f [ i - f [ i - 1 ] ] ;
  return f [ n ] ;
}


//TOFILL

}
