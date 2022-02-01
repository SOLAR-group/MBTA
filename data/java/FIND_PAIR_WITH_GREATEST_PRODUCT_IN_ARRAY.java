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
public class FIND_PAIR_WITH_GREATEST_PRODUCT_IN_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int result = - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < n - 1 ;
  j ++ ) for ( int k = j + 1 ;
  k < n ;
  k ++ ) if ( arr [ j ] * arr [ k ] == arr [ i ] ) result = Math . max ( result , arr [ i ] ) ;
  return result ;
}


//TOFILL

}
