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
public class TILING_WITH_DOMINOES{
static int f_gold ( int n ) {
  int [ ] A = new int [ n + 1 ] ;
  int [ ] B = new int [ n + 1 ] ;
  A [ 0 ] = 1 ;
  A [ 1 ] = 0 ;
  B [ 0 ] = 0 ;
  B [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    A [ i ] = A [ i - 2 ] + 2 * B [ i - 1 ] ;
    B [ i ] = A [ i - 1 ] + B [ i - 2 ] ;
  }
  return A [ n ] ;
}


//TOFILL

}
