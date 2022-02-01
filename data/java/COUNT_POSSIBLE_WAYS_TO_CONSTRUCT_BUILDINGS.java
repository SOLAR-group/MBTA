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
public class COUNT_POSSIBLE_WAYS_TO_CONSTRUCT_BUILDINGS{
static int f_gold ( int N ) {
  if ( N == 1 ) return 4 ;
  int countB = 1 , countS = 1 , prev_countB , prev_countS ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    prev_countB = countB ;
    prev_countS = countS ;
    countS = prev_countB + prev_countS ;
    countB = prev_countS ;
  }
  int result = countS + countB ;
  return ( result * result ) ;
}


//TOFILL

}
