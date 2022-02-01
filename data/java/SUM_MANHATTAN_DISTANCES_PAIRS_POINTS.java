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
public class SUM_MANHATTAN_DISTANCES_PAIRS_POINTS{
static int f_gold ( int x [ ] , int y [ ] , int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) sum += ( Math . abs ( x [ i ] - x [ j ] ) + Math . abs ( y [ i ] - y [ j ] ) ) ;
  return sum ;
}


//TOFILL

}
