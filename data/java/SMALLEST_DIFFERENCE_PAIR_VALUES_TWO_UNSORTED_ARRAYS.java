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
public class SMALLEST_DIFFERENCE_PAIR_VALUES_TWO_UNSORTED_ARRAYS{
static int f_gold ( int A [ ] , int B [ ] , int m , int n ) {
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  int a = 0 , b = 0 ;
  int result = Integer . MAX_VALUE ;
  while ( a < m && b < n ) {
    if ( Math . abs ( A [ a ] - B [ b ] ) < result ) result = Math . abs ( A [ a ] - B [ b ] ) ;
    if ( A [ a ] < B [ b ] ) a ++ ;
    else b ++ ;
  }
  return result ;
}


//TOFILL

}
