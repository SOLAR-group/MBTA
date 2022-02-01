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
public class LONGEST_EVEN_LENGTH_SUBSTRING_SUM_FIRST_SECOND_HALF{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int maxlen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j += 2 ) {
      int length = j - i + 1 ;
      int leftsum = 0 , rightsum = 0 ;
      for ( int k = 0 ;
      k < length / 2 ;
      k ++ ) {
        leftsum += ( str . charAt ( i + k ) - '0' ) ;
        rightsum += ( str . charAt ( i + k + length / 2 ) - '0' ) ;
      }
      if ( leftsum == rightsum && maxlen < length ) maxlen = length ;
    }
  }
  return maxlen ;
}


//TOFILL

}
