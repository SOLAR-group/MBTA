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
public class SQUARE_ROOT_OF_AN_INTEGER_1{
public static int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x ;
  int start = 1 , end = x , ans = 0 ;
  while ( start <= end ) {
    int mid = ( start + end ) / 2 ;
    if ( mid * mid == x ) return mid ;
    if ( mid * mid < x ) {
      start = mid + 1 ;
      ans = mid ;
    }
    else end = mid - 1 ;
  }
  return ans ;
}


//TOFILL

}
