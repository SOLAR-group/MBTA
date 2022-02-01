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
public class FIND_LAST_DIGIT_FACTORIAL_DIVIDES_FACTORIAL_B{
static int f_gold ( long A , long B ) {
  int variable = 1 ;
  if ( A == B ) return 1 ;
  else if ( ( B - A ) >= 5 ) return 0 ;
  else {
    for ( long i = A + 1 ;
    i <= B ;
    i ++ ) variable = ( int ) ( variable * ( i % 10 ) ) % 10 ;
    return variable % 10 ;
  }
}


//TOFILL

}
