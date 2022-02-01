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
public class MINIMUM_SWAPS_REQUIRED_BRING_ELEMENTS_LESS_EQUAL_K_TOGETHER{
static int f_gold ( int arr [ ] , int n , int k ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) if ( arr [ i ] <= k ) ++ count ;
  int bad = 0 ;
  for ( int i = 0 ;
  i < count ;
  ++ i ) if ( arr [ i ] > k ) ++ bad ;
  int ans = bad ;
  for ( int i = 0 , j = count ;
  j < n ;
  ++ i , ++ j ) {
    if ( arr [ i ] > k ) -- bad ;
    if ( arr [ j ] > k ) ++ bad ;
    ans = Math . min ( ans , bad ) ;
  }
  return ans ;
}


//TOFILL

}
