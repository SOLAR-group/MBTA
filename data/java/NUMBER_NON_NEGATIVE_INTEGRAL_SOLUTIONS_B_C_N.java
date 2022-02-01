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
public class NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) for ( int j = 0 ;
  j <= n - i ;
  j ++ ) for ( int k = 0 ;
  k <= ( n - i - j ) ;
  k ++ ) if ( i + j + k == n ) result ++ ;
  return result ;
}


//TOFILL

}
