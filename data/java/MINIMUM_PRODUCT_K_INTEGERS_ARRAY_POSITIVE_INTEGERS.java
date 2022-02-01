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
public class MINIMUM_PRODUCT_K_INTEGERS_ARRAY_POSITIVE_INTEGERS{
public static int f_gold ( int [ ] arr , int n , int k ) {
  PriorityQueue < Integer > pq = new PriorityQueue < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) pq . add ( arr [ i ] ) ;
  int count = 0 , ans = 1 ;
  while ( pq . isEmpty ( ) == false && count < k ) {
    ans = ans * pq . element ( ) ;
    pq . remove ( ) ;
    count ++ ;
  }
  return ans ;
}


//TOFILL

}
