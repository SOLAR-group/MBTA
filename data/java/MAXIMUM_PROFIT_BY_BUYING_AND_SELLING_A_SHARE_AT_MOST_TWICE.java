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
public class MAXIMUM_PROFIT_BY_BUYING_AND_SELLING_A_SHARE_AT_MOST_TWICE{
static int f_gold ( int price [ ] , int n ) {
  int profit [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) profit [ i ] = 0 ;
  int max_price = price [ n - 1 ] ;
  for ( int i = n - 2 ;
  i >= 0 ;
  i -- ) {
    if ( price [ i ] > max_price ) max_price = price [ i ] ;
    profit [ i ] = Math . max ( profit [ i + 1 ] , max_price - price [ i ] ) ;
  }
  int min_price = price [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( price [ i ] < min_price ) min_price = price [ i ] ;
    profit [ i ] = Math . max ( profit [ i - 1 ] , profit [ i ] + ( price [ i ] - min_price ) ) ;
  }
  int result = profit [ n - 1 ] ;
  return result ;
}


//TOFILL

}
