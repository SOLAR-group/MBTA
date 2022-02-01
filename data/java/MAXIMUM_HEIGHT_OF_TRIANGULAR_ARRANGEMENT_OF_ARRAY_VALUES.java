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
public class MAXIMUM_HEIGHT_OF_TRIANGULAR_ARRANGEMENT_OF_ARRAY_VALUES{
static int f_gold ( int [ ] a , int n ) {
  int result = 1 ;
  for ( int i = 1 ;
  i <= n ;
  ++ i ) {
    int y = ( i * ( i + 1 ) ) / 2 ;
    if ( y < n ) result = i ;
    else break ;
  }
  return result ;
}


//TOFILL

}
