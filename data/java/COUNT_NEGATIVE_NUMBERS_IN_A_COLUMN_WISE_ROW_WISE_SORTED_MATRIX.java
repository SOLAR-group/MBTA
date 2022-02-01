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
public class COUNT_NEGATIVE_NUMBERS_IN_A_COLUMN_WISE_ROW_WISE_SORTED_MATRIX{
static int f_gold ( int M [ ] [ ] , int n , int m ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( M [ i ] [ j ] < 0 ) count += 1 ;
      else break ;
    }
  }
  return count ;
}


//TOFILL

}
