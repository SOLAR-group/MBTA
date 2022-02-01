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
public class PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING{
static int f_gold ( String tree , int k ) {
  int level = - 1 ;
  int product = 1 ;
  int n = tree . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( tree . charAt ( i ) == '(' ) level ++ ;
    else if ( tree . charAt ( i ) == ')' ) level -- ;
    else {
      if ( level == k ) product *= ( tree . charAt ( i ) - '0' ) ;
    }
  }
  return product ;
}


//TOFILL

}
