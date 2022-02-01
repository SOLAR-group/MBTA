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
public class FIND_A_TRIPLET_THAT_SUM_TO_A_GIVEN_VALUE_2{
static boolean f_gold ( int A [ ] , int arr_size , int sum ) {
  for ( int i = 0 ;
  i < arr_size - 2 ;
  i ++ ) {
    HashSet < Integer > s = new HashSet < Integer > ( ) ;
    int curr_sum = sum - A [ i ] ;
    for ( int j = i + 1 ;
    j < arr_size ;
    j ++ ) {
      if ( s . contains ( curr_sum - A [ j ] ) && curr_sum - A [ j ] != ( int ) s . toArray ( ) [ s . size ( ) - 1 ] ) {
        System . out . printf ( "Triplet is %d, %d, %d" , A [ i ] , A [ j ] , curr_sum - A [ j ] ) ;
        return true ;
      }
      s . add ( A [ j ] ) ;
    }
  }
  return false ;
}


//TOFILL

}
