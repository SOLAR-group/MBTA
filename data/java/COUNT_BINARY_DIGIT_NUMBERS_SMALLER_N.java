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
public class COUNT_BINARY_DIGIT_NUMBERS_SMALLER_N{
static int f_gold ( int N ) {
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( 1 ) ;
  int cnt = 0 ;
  int t ;
  while ( q . size ( ) > 0 ) {
    t = q . peek ( ) ;
    q . remove ( ) ;
    if ( t <= N ) {
      cnt ++ ;
      q . add ( t * 10 ) ;
      q . add ( t * 10 + 1 ) ;
    }
  }
  return cnt ;
}


//TOFILL

}
