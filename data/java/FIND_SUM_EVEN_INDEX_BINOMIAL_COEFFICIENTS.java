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
public class FIND_SUM_EVEN_INDEX_BINOMIAL_COEFFICIENTS{
static int f_gold ( int n ) {
  int C [ ] [ ] = new int [ n + 1 ] [ n + 1 ] ;
  int i , j ;
  for ( i = 0 ;
  i <= n ;
  i ++ ) {
    for ( j = 0 ;
    j <= Math . min ( i , n ) ;
    j ++ ) {
      if ( j == 0 || j == i ) C [ i ] [ j ] = 1 ;
      else C [ i ] [ j ] = C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ;
    }
  }
  int sum = 0 ;
  for ( i = 0 ;
  i <= n ;
  i += 2 ) sum += C [ n ] [ i ] ;
  return sum ;
}


//TOFILL

}
