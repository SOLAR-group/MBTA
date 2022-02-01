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
public class CHECK_LARGE_NUMBER_DIVISIBLE_4_NOT{
static boolean f_gold ( String str ) {
  int n = str . length ( ) ;
  if ( n == 0 ) return false ;
  if ( n == 1 ) return ( ( str . charAt ( 0 ) - '0' ) % 4 == 0 ) ;
  int last = str . charAt ( n - 1 ) - '0' ;
  int second_last = str . charAt ( n - 2 ) - '0' ;
  return ( ( second_last * 10 + last ) % 4 == 0 ) ;
}


//TOFILL

}
