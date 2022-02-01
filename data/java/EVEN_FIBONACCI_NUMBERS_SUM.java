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
public class EVEN_FIBONACCI_NUMBERS_SUM{
static int f_gold ( int limit ) {
  if ( limit < 2 ) return 0 ;
  long ef1 = 0 , ef2 = 2 ;
  long sum = ef1 + ef2 ;
  while ( ef2 <= limit ) {
    long ef3 = 4 * ef2 + ef1 ;
    if ( ef3 > limit ) break ;
    ef1 = ef2 ;
    ef2 = ef3 ;
    sum += ef2 ;
  }
  return ( int ) sum ;
}


//TOFILL

}
