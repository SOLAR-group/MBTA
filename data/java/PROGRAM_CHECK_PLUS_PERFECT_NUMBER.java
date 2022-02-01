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
public class PROGRAM_CHECK_PLUS_PERFECT_NUMBER{
static boolean f_gold ( int x ) {
  int temp = x ;
  int n = 0 ;
  while ( x != 0 ) {
    x /= 10 ;
    n ++ ;
  }
  x = temp ;
  int sum = 0 ;
  while ( x != 0 ) {
    sum += Math . pow ( x % 10 , n ) ;
    x /= 10 ;
  }
  return ( sum == temp ) ;
}


//TOFILL

}
