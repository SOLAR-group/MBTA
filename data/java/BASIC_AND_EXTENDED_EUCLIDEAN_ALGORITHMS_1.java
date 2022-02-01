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
public class BASIC_AND_EXTENDED_EUCLIDEAN_ALGORITHMS_1{
public static int f_gold ( int a , int b , int x , int y ) {
  if ( a == 0 ) {
    x = 0 ;
    y = 1 ;
    return b ;
  }
  int x1 = 1 , y1 = 1 ;
  int gcd = f_gold ( b % a , a , x1 , y1 ) ;
  x = y1 - ( b / a ) * x1 ;
  y = x1 ;
  return gcd ;
}


//TOFILL

}
