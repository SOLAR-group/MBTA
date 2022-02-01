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
public class LONGEST_CONSECUTIVE_SUBSEQUENCE{
static int f_gold ( int arr [ ] , int n ) {
  HashSet < Integer > S = new HashSet < Integer > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) S . add ( arr [ i ] ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    if ( ! S . contains ( arr [ i ] - 1 ) ) {
      int j = arr [ i ] ;
      while ( S . contains ( j ) ) j ++ ;
      if ( ans < j - arr [ i ] ) ans = j - arr [ i ] ;
    }
  }
  return ans ;
}


//TOFILL

}