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
public class MAXIMUM_GAMES_PLAYED_WINNER{
static int f_gold ( int N ) {
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 1 ;
  dp [ 1 ] = 2 ;
  int i = 2 ;
  do {
    dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ] ;
  }
  while ( dp [ i ++ ] <= N ) ;
  return ( i - 2 ) ;
}


//TOFILL

}
