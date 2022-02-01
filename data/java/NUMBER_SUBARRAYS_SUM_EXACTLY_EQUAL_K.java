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
public class NUMBER_SUBARRAYS_SUM_EXACTLY_EQUAL_K{
static int f_gold ( int arr [ ] , int n , int sum ) {
  HashMap < Integer , Integer > prevSum = new HashMap < > ( ) ;
  int res = 0 ;
  int currsum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    currsum += arr [ i ] ;
    if ( currsum == sum ) res ++ ;
    if ( prevSum . containsKey ( currsum - sum ) ) res += prevSum . get ( currsum - sum ) ;
    Integer count = prevSum . get ( currsum ) ;
    if ( count == null ) prevSum . put ( currsum , 1 ) ;
    else prevSum . put ( currsum , count + 1 ) ;
  }
  return res ;
}


//TOFILL

}
