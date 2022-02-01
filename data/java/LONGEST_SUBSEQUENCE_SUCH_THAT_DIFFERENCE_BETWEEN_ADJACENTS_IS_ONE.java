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
public class LONGEST_SUBSEQUENCE_SUCH_THAT_DIFFERENCE_BETWEEN_ADJACENTS_IS_ONE{
static int f_gold ( int arr [ ] , int n ) {
  int dp [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) dp [ i ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( ( arr [ i ] == arr [ j ] + 1 ) || ( arr [ i ] == arr [ j ] - 1 ) ) dp [ i ] = Math . max ( dp [ i ] , dp [ j ] + 1 ) ;
    }
  }
  int result = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( result < dp [ i ] ) result = dp [ i ] ;
  return result ;
}


//TOFILL

}
