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
public class PRINT_MAXIMUM_SHORTEST_DISTANCE{
static int f_gold ( int a [ ] , int n , int k ) {
  HashMap < Integer , Integer > b = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    int d = Math . min ( 1 + i , n - i ) ;
    if ( ! b . containsKey ( x ) ) b . put ( x , d ) ;
    else {
      b . put ( x , Math . min ( d , b . get ( x ) ) ) ;
    }
  }
  int ans = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = a [ i ] ;
    if ( x != k - x && b . containsKey ( k - x ) ) ans = Math . min ( Math . max ( b . get ( x ) , b . get ( k - x ) ) , ans ) ;
  }
  return ans ;
}


//TOFILL

}
