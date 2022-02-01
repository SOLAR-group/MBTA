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
public class FIND_INDEX_GIVEN_FIBONACCI_NUMBER_CONSTANT_TIME{
static int f_gold ( int n ) {
  if ( n <= 1 ) return n ;
  int a = 0 , b = 1 , c = 1 ;
  int res = 1 ;
  while ( c < n ) {
    c = a + b ;
    res ++ ;
    a = b ;
    b = c ;
  }
  return res ;
}


//TOFILL

}
