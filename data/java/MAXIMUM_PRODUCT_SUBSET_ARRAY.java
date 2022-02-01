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
public class MAXIMUM_PRODUCT_SUBSET_ARRAY{
static int f_gold ( int a [ ] , int n ) {
  if ( n == 1 ) {
    return a [ 0 ] ;
  }
  int max_neg = Integer . MIN_VALUE ;
  int count_neg = 0 , count_zero = 0 ;
  int prod = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      count_zero ++ ;
      continue ;
    }
    if ( a [ i ] < 0 ) {
      count_neg ++ ;
      max_neg = Math . max ( max_neg , a [ i ] ) ;
    }
    prod = prod * a [ i ] ;
  }
  if ( count_zero == n ) {
    return 0 ;
  }
  if ( count_neg % 2 == 1 ) {
    if ( count_neg == 1 && count_zero > 0 && count_zero + count_neg == n ) {
      return 0 ;
    }
    prod = prod / max_neg ;
  }
  return prod ;
}


//TOFILL

}
