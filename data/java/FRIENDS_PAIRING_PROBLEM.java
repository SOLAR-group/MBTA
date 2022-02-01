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
public class FRIENDS_PAIRING_PROBLEM{
static int f_gold ( int n ) {
  int dp [ ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( i <= 2 ) dp [ i ] = i ;
    else dp [ i ] = dp [ i - 1 ] + ( i - 1 ) * dp [ i - 2 ] ;
  }
  return dp [ n ] ;
}


//TOFILL

}
