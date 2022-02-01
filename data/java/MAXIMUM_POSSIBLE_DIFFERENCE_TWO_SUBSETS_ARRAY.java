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
public class MAXIMUM_POSSIBLE_DIFFERENCE_TWO_SUBSETS_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int SubsetSum_1 = 0 , SubsetSum_2 = 0 ;
  for ( int i = 0 ;
  i <= n - 1 ;
  i ++ ) {
    boolean isSingleOccurance = true ;
    for ( int j = i + 1 ;
    j <= n - 1 ;
    j ++ ) {
      if ( arr [ i ] == arr [ j ] ) {
        isSingleOccurance = false ;
        arr [ i ] = arr [ j ] = 0 ;
        break ;
      }
    }
    if ( isSingleOccurance ) {
      if ( arr [ i ] > 0 ) SubsetSum_1 += arr [ i ] ;
      else SubsetSum_2 += arr [ i ] ;
    }
  }
  return Math . abs ( SubsetSum_1 - SubsetSum_2 ) ;
}


//TOFILL

}
