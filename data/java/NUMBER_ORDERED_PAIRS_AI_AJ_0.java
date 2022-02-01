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
public class NUMBER_ORDERED_PAIRS_AI_AJ_0{
static int f_gold ( int a [ ] , int n ) {
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) if ( ( a [ i ] & a [ j ] ) == 0 ) count += 2 ;
  }
  return count ;
}


//TOFILL

}
