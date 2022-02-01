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
public class DICE_THROW_PROBLEM_1{
public static long f_gold ( int f , int d , int s ) {
  long mem [ ] [ ] = new long [ d + 1 ] [ s + 1 ] ;
  mem [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= d ;
  i ++ ) {
    for ( int j = i ;
    j <= s ;
    j ++ ) {
      mem [ i ] [ j ] = mem [ i ] [ j - 1 ] + mem [ i - 1 ] [ j - 1 ] ;
      if ( j - f - 1 >= 0 ) mem [ i ] [ j ] -= mem [ i - 1 ] [ j - f - 1 ] ;
    }
  }
  return mem [ d ] [ s ] ;
}


//TOFILL

}
