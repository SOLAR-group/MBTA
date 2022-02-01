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
public class EULERIAN_NUMBER_1{
public static int f_gold ( int n , int m ) {
  int [ ] [ ] dp = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j <= m ;
    j ++ ) {
      if ( i > j ) {
        if ( j == 0 ) dp [ i ] [ j ] = 1 ;
        else dp [ i ] [ j ] = ( ( i - j ) * dp [ i - 1 ] [ j - 1 ] ) + ( ( j + 1 ) * dp [ i - 1 ] [ j ] ) ;
      }
    }
  }
  return dp [ n ] [ m ] ;
}


//TOFILL

}
