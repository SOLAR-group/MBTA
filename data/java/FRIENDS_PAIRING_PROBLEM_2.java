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
public class FRIENDS_PAIRING_PROBLEM_2{
static int f_gold ( int n ) {
  int a = 1 , b = 2 , c = 0 ;
  if ( n <= 2 ) {
    return n ;
  }
  for ( int i = 3 ;
  i <= n ;
  i ++ ) {
    c = b + ( i - 1 ) * a ;
    a = b ;
    b = c ;
  }
  return c ;
}


//TOFILL

}
