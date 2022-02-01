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
public class MINIMUM_SUM_PRODUCT_TWO_ARRAYS{
static int f_gold ( int a [ ] , int b [ ] , int n , int k ) {
  int diff = 0 , res = 0 ;
  int temp = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int pro = a [ i ] * b [ i ] ;
    res = res + pro ;
    if ( pro < 0 && b [ i ] < 0 ) temp = ( a [ i ] + 2 * k ) * b [ i ] ;
    else if ( pro < 0 && a [ i ] < 0 ) temp = ( a [ i ] - 2 * k ) * b [ i ] ;
    else if ( pro > 0 && a [ i ] < 0 ) temp = ( a [ i ] + 2 * k ) * b [ i ] ;
    else if ( pro > 0 && a [ i ] > 0 ) temp = ( a [ i ] - 2 * k ) * b [ i ] ;
    int d = Math . abs ( pro - temp ) ;
    if ( d > diff ) diff = d ;
  }
  return res - diff ;
}


//TOFILL

}
