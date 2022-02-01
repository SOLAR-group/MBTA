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
public class LONGEST_INCREASING_ODD_EVEN_SUBSEQUENCE{
public static int f_gold ( int arr [ ] , int n ) {
  int [ ] lioes = new int [ n ] ;
  int maxLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lioes [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < i ;
  j ++ ) if ( arr [ i ] > arr [ j ] && ( arr [ i ] + arr [ j ] ) % 2 != 0 && lioes [ i ] < lioes [ j ] + 1 ) lioes [ i ] = lioes [ j ] + 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( maxLen < lioes [ i ] ) maxLen = lioes [ i ] ;
  return maxLen ;
}


//TOFILL

}
