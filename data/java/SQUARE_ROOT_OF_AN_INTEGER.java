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
public class SQUARE_ROOT_OF_AN_INTEGER{
static int f_gold ( int x ) {
  if ( x == 0 || x == 1 ) return x ;
  int i = 1 , result = 1 ;
  while ( result <= x ) {
    i ++ ;
    result = i * i ;
  }
  return i - 1 ;
}


//TOFILL

}
