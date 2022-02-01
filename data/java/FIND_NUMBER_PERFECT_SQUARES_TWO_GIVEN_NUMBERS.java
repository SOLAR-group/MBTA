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
public class FIND_NUMBER_PERFECT_SQUARES_TWO_GIVEN_NUMBERS{
static int f_gold ( int a , int b ) {
  int cnt = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) for ( int j = 1 ;
  j * j <= i ;
  j ++ ) if ( j * j == i ) cnt ++ ;
  return cnt ;
}


//TOFILL

}
