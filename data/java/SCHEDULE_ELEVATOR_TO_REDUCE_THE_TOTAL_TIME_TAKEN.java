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
public class SCHEDULE_ELEVATOR_TO_REDUCE_THE_TOTAL_TIME_TAKEN{
static int f_gold ( int n , int k , int a [ ] ) {
  int temp ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( a [ i ] < a [ j ] ) {
        temp = a [ i ] ;
        a [ i ] = a [ j ] ;
        a [ j ] = temp ;
      }
    }
  }
  int f_gold = 0 ;
  for ( int i = 0 ;
  i < n ;
  i += k ) f_gold += ( 2 * a [ i ] ) ;
  return f_gold ;
}


//TOFILL

}
