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
public class COUNT_INDEX_PAIRS_EQUAL_ELEMENTS_ARRAY_1{
public static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hm = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( hm . containsKey ( arr [ i ] ) ) hm . put ( arr [ i ] , hm . get ( arr [ i ] ) + 1 ) ;
    else hm . put ( arr [ i ] , 1 ) ;
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > it : hm . entrySet ( ) ) {
    int count = it . getValue ( ) ;
    ans += ( count * ( count - 1 ) ) / 2 ;
  }
  return ans ;
}


//TOFILL

}
