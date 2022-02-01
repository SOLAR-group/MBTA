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
public class CHECK_ARRAY_REPRESENTS_INORDER_BINARY_SEARCH_TREE_NOT{
static boolean f_gold ( int [ ] arr , int n ) {
  if ( n == 0 || n == 1 ) {
    return true ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( arr [ i - 1 ] > arr [ i ] ) {
      return false ;
    }
  }
  return true ;
}


//TOFILL

}
