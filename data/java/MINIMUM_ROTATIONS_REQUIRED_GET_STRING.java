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
public class MINIMUM_ROTATIONS_REQUIRED_GET_STRING{
static int f_gold ( String str ) {
  String tmp = str + str ;
  int n = str . length ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    String substring = tmp . substring ( i , str . length ( ) ) ;
    if ( str == substring ) return i ;
  }
  return n ;
}


//TOFILL

}
