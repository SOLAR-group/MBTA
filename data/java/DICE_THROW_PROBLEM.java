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
public class DICE_THROW_PROBLEM{
public static long f_gold ( int m , int n , int x ) {
  long [ ] [ ] table = new long [ n + 1 ] [ x + 1 ] ;
  for ( int j = 1 ;
  j <= m && j <= x ;
  j ++ ) table [ 1 ] [ j ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= x ;
    j ++ ) {
      for ( int k = 1 ;
      k < j && k <= m ;
      k ++ ) table [ i ] [ j ] += table [ i - 1 ] [ j - k ] ;
    }
  }
  return table [ n ] [ x ] ;
}


//TOFILL

}
