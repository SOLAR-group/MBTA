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
public class ELEMENTS_TO_BE_ADDED_SO_THAT_ALL_ELEMENTS_OF_A_RANGE_ARE_PRESENT_IN_ARRAY{
static int f_gold ( int [ ] arr , int n ) {
  int count = 0 ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) if ( arr [ i ] != arr [ i + 1 ] && arr [ i ] != arr [ i + 1 ] - 1 ) count += arr [ i + 1 ] - arr [ i ] - 1 ;
  return count ;
}


//TOFILL

}
