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
public class MINIMUM_PRODUCT_SUBSET_ARRAY{
static int f_gold ( int a [ ] , int n ) {
  if ( n == 1 ) return a [ 0 ] ;
  int negmax = Integer . MIN_VALUE ;
  int posmin = Integer . MAX_VALUE ;
  int count_neg = 0 , count_zero = 0 ;
  int product = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      count_zero ++ ;
      continue ;
    }
    if ( a [ i ] < 0 ) {
      count_neg ++ ;
      negmax = Math . max ( negmax , a [ i ] ) ;
    }
    if ( a [ i ] > 0 && a [ i ] < posmin ) posmin = a [ i ] ;
    product *= a [ i ] ;
  }
  if ( count_zero == n || ( count_neg == 0 && count_zero > 0 ) ) return 0 ;
  if ( count_neg == 0 ) return posmin ;
  if ( count_neg % 2 == 0 && count_neg != 0 ) {
    product = product / negmax ;
  }
  return product ;
}


//TOFILL

}
