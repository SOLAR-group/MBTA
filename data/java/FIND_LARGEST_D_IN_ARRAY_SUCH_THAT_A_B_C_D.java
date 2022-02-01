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
public class FIND_LARGEST_D_IN_ARRAY_SUCH_THAT_A_B_C_D{
static int f_gold ( int [ ] S , int n ) {
  boolean found = false ;
  Arrays . sort ( S ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i == j ) continue ;
      for ( int k = j + 1 ;
      k < n ;
      k ++ ) {
        if ( i == k ) continue ;
        for ( int l = k + 1 ;
        l < n ;
        l ++ ) {
          if ( i == l ) continue ;
          if ( S [ i ] == S [ j ] + S [ k ] + S [ l ] ) {
            found = true ;
            return S [ i ] ;
          }
        }
      }
    }
  }
  if ( found == false ) return Integer . MAX_VALUE ;
  return - 1 ;
}


//TOFILL

}
