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
public class FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE{
static boolean f_gold ( int A [ ] , int arr_size , int sum ) {
  int l , r ;
  for ( int i = 0 ;
  i < arr_size - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < arr_size - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < arr_size ;
      k ++ ) {
        if ( A [ i ] + A [ j ] + A [ k ] == sum ) {
          System . out . print ( "Triplet is " + A [ i ] + ", " + A [ j ] + ", " + A [ k ] ) ;
          return true ;
        }
      }
    }
  }
  return false ;
}


//TOFILL

}
