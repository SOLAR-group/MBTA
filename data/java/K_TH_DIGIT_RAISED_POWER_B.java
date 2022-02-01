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
public class K_TH_DIGIT_RAISED_POWER_B{
public static int f_gold ( int a , int b , int k ) {
  int p = ( int ) Math . pow ( a , b ) ;
  int count = 0 ;
  while ( p > 0 && count < k ) {
    int rem = p % 10 ;
    count ++ ;
    if ( count == k ) return rem ;
    p = p / 10 ;
  }
  return 0 ;
}


//TOFILL

}
