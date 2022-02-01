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
public class COUNT_INVERSIONS_OF_SIZE_THREE_IN_A_GIVE_ARRAY{
static int f_gold ( int arr [ ] , int n ) {
  int invcount = 0 ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n - 1 ;
    j ++ ) {
      if ( arr [ i ] > arr [ j ] ) {
        for ( int k = j + 1 ;
        k < n ;
        k ++ ) {
          if ( arr [ j ] > arr [ k ] ) invcount ++ ;
        }
      }
    }
  }
  return invcount ;
}


//TOFILL

}
