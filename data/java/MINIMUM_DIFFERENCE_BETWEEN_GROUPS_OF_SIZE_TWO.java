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
public class MINIMUM_DIFFERENCE_BETWEEN_GROUPS_OF_SIZE_TWO{
static long f_gold ( long a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int i , j ;
  Vector < Long > s = new Vector < > ( ) ;
  for ( i = 0 , j = n - 1 ;
  i < j ;
  i ++ , j -- ) s . add ( ( a [ i ] + a [ j ] ) ) ;
  long mini = Collections . min ( s ) ;
  long maxi = Collections . max ( s ) ;
  return Math . abs ( maxi - mini ) ;
}


//TOFILL

}
