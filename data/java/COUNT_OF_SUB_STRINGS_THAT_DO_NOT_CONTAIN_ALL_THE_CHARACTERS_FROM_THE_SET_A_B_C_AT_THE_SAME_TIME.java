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
public class COUNT_OF_SUB_STRINGS_THAT_DO_NOT_CONTAIN_ALL_THE_CHARACTERS_FROM_THE_SET_A_B_C_AT_THE_SAME_TIME{
static int f_gold ( char str [ ] , int n ) {
  int ans = ( n * ( n + 1 ) ) / 2 ;
  int a_index = 0 ;
  int b_index = 0 ;
  int c_index = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( str [ i ] == 'a' ) {
      a_index = i + 1 ;
      ans -= Math . min ( b_index , c_index ) ;
    }
    else if ( str [ i ] == 'b' ) {
      b_index = i + 1 ;
      ans -= Math . min ( a_index , c_index ) ;
    }
    else {
      c_index = i + 1 ;
      ans -= Math . min ( a_index , b_index ) ;
    }
  }
  return ans ;
}


//TOFILL

}
