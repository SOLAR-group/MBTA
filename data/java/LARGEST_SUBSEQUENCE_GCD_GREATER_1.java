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
public class LARGEST_SUBSEQUENCE_GCD_GREATER_1{
static int f_gold ( int arr [ ] , int n ) {
  int ans = 0 ;
  int maxele = Arrays . stream ( arr ) . max ( ) . getAsInt ( ) ;
  ;
  for ( int i = 2 ;
  i <= maxele ;
  ++ i ) {
    int count = 0 ;
    for ( int j = 0 ;
    j < n ;
    ++ j ) {
      if ( arr [ j ] % i == 0 ) ++ count ;
    }
    ans = Math . max ( ans , count ) ;
  }
  return ans ;
}


//TOFILL

}
