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
public class LONGEST_PALINDROME_SUBSEQUENCE_SPACE{
static int f_gold ( String s ) {
  int n = s . length ( ) ;
  int a [ ] = new int [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int back_up = 0 ;
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( j == i ) a [ j ] = 1 ;
      else if ( s . charAt ( i ) == s . charAt ( j ) ) {
        int temp = a [ j ] ;
        a [ j ] = back_up + 2 ;
        back_up = temp ;
      }
      else {
        back_up = a [ j ] ;
        a [ j ] = Math . max ( a [ j - 1 ] , a [ j ] ) ;
      }
    }
  }
  return a [ n - 1 ] ;
}


//TOFILL

}
