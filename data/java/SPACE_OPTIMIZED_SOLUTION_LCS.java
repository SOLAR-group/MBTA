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
public class SPACE_OPTIMIZED_SOLUTION_LCS{
public static int f_gold ( String X , String Y ) {
  int m = X . length ( ) , n = Y . length ( ) ;
  int L [ ] [ ] = new int [ 2 ] [ n + 1 ] ;
  int bi = 0 ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    bi = i & 1 ;
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      if ( i == 0 || j == 0 ) L [ bi ] [ j ] = 0 ;
      else if ( X . charAt ( i - 1 ) == Y . charAt ( j - 1 ) ) L [ bi ] [ j ] = L [ 1 - bi ] [ j - 1 ] + 1 ;
      else L [ bi ] [ j ] = Math . max ( L [ 1 - bi ] [ j ] , L [ bi ] [ j - 1 ] ) ;
    }
  }
  return L [ bi ] [ n ] ;
}


//TOFILL

}
