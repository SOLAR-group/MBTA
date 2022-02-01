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
public class FINDING_POWER_PRIME_NUMBER_P_N{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int count = 0 , temp = i ;
    while ( temp % p == 0 ) {
      count ++ ;
      temp = temp / p ;
    }
    ans += count ;
  }
  return ans ;
}


//TOFILL

}
