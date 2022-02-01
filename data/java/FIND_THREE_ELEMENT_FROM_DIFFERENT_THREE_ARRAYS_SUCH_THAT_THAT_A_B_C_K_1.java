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
public class FIND_THREE_ELEMENT_FROM_DIFFERENT_THREE_ARRAYS_SUCH_THAT_THAT_A_B_C_K_1{
static boolean f_gold ( int a1 [ ] , int a2 [ ] , int a3 [ ] , int n1 , int n2 , int n3 , int sum ) {
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    s . add ( a1 [ i ] ) ;
  }
  ArrayList < Integer > al = new ArrayList < > ( s ) ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n3 ;
    j ++ ) {
      if ( al . contains ( sum - a2 [ i ] - a3 [ j ] ) & al . indexOf ( sum - a2 [ i ] - a3 [ j ] ) != al . get ( al . size ( ) - 1 ) ) {
        return true ;
      }
    }
  }
  return false ;
}


//TOFILL

}
