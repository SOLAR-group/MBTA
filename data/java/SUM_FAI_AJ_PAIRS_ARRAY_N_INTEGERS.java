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
public class SUM_FAI_AJ_PAIRS_ARRAY_N_INTEGERS{
public static int f_gold ( int a [ ] , int n ) {
  Map < Integer , Integer > cnt = new HashMap < Integer , Integer > ( ) ;
  int ans = 0 , pre_sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += ( i * a [ i ] ) - pre_sum ;
    pre_sum += a [ i ] ;
    if ( cnt . containsKey ( a [ i ] - 1 ) ) ans -= cnt . get ( a [ i ] - 1 ) ;
    if ( cnt . containsKey ( a [ i ] + 1 ) ) ans += cnt . get ( a [ i ] + 1 ) ;
    if ( cnt . containsKey ( a [ i ] ) ) {
      cnt . put ( a [ i ] , cnt . get ( a [ i ] ) + 1 ) ;
    }
    else {
      cnt . put ( a [ i ] , 1 ) ;
    }
  }
  return ans ;
}


//TOFILL

}
