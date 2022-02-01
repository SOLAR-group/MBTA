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
public class STACK_PERMUTATIONS_CHECK_IF_AN_ARRAY_IS_STACK_PERMUTATION_OF_OTHER{
static boolean f_gold ( int ip [ ] , int op [ ] , int n ) {
  Queue < Integer > input = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    input . add ( ip [ i ] ) ;
  }
  Queue < Integer > output = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    output . add ( op [ i ] ) ;
  }
  Stack < Integer > tempStack = new Stack < > ( ) ;
  while ( ! input . isEmpty ( ) ) {
    int ele = input . poll ( ) ;
    if ( ele == output . peek ( ) ) {
      output . poll ( ) ;
      while ( ! tempStack . isEmpty ( ) ) {
        if ( tempStack . peek ( ) == output . peek ( ) ) {
          tempStack . pop ( ) ;
          output . poll ( ) ;
        }
        else break ;
      }
    }
    else {
      tempStack . push ( ele ) ;
    }
  }
  return ( input . isEmpty ( ) && tempStack . isEmpty ( ) ) ;
}


//TOFILL

}
