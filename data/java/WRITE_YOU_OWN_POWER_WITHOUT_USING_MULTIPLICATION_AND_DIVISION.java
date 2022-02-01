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
public class WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION{
static int f_gold ( int a , int b ) {
  if ( b == 0 ) return 1 ;
  int answer = a ;
  int increment = a ;
  int i , j ;
  for ( i = 1 ;
  i < b ;
  i ++ ) {
    for ( j = 1 ;
    j < a ;
    j ++ ) {
      answer += increment ;
    }
    increment = answer ;
  }
  return answer ;
}


//TOFILL

}
