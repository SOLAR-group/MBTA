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
public class WRITE_AN_EFFICIENT_METHOD_TO_CHECK_IF_A_NUMBER_IS_MULTIPLE_OF_3{
static int f_gold ( int n ) {
  int odd_count = 0 ;
  int even_count = 0 ;
  if ( n < 0 ) n = - n ;
  if ( n == 0 ) return 1 ;
  if ( n == 1 ) return 0 ;
  while ( n != 0 ) {
    if ( ( n & 1 ) != 0 ) odd_count ++ ;
    if ( ( n & 2 ) != 0 ) even_count ++ ;
    n = n >> 2 ;
  }
  return f_gold ( Math . abs ( odd_count - even_count ) ) ;
}


//TOFILL

}
