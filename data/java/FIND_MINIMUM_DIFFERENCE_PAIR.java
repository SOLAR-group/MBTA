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
public class FIND_MINIMUM_DIFFERENCE_PAIR{
static int f_gold ( int [ ] arr , int n ) {
  int diff = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( Math . abs ( ( arr [ i ] - arr [ j ] ) ) < diff ) diff = Math . abs ( ( arr [ i ] - arr [ j ] ) ) ;
  return diff ;
}


//TOFILL

}
