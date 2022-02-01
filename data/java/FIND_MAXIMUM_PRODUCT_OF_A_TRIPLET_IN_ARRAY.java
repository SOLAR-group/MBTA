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
public class FIND_MAXIMUM_PRODUCT_OF_A_TRIPLET_IN_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  if ( n < 3 ) return - 1 ;
  int max_product = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) for ( int j = i + 1 ;
  j < n - 1 ;
  j ++ ) for ( int k = j + 1 ;
  k < n ;
  k ++ ) max_product = Math . max ( max_product , arr [ i ] * arr [ j ] * arr [ k ] ) ;
  return max_product ;
}


//TOFILL

}
