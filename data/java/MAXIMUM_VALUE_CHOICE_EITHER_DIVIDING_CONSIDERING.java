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
public class MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING{
static int f_gold ( int n ) {
  int res [ ] = new int [ n + 1 ] ;
  res [ 0 ] = 0 ;
  res [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) res [ i ] = Math . max ( i , ( res [ i / 2 ] + res [ i / 3 ] + res [ i / 4 ] + res [ i / 5 ] ) ) ;
  return res [ n ] ;
}


//TOFILL

}
