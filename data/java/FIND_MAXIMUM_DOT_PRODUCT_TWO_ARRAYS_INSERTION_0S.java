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
public class FIND_MAXIMUM_DOT_PRODUCT_TWO_ARRAYS_INSERTION_0S{
static int f_gold ( int A [ ] , int B [ ] , int m , int n ) {
  int dp [ ] [ ] = new int [ n + 1 ] [ m + 1 ] ;
  for ( int [ ] row : dp ) Arrays . fill ( row , 0 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) for ( int j = i ;
  j <= m ;
  j ++ ) dp [ i ] [ j ] = Math . max ( ( dp [ i - 1 ] [ j - 1 ] + ( A [ j - 1 ] * B [ i - 1 ] ) ) , dp [ i ] [ j - 1 ] ) ;
  return dp [ n ] [ m ] ;
}


//TOFILL

}
