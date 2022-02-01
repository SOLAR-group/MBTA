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
public class FIND_THE_NUMBER_OCCURRING_ODD_NUMBER_OF_TIMES{
static int f_gold ( int arr [ ] , int arr_size ) {
  int i ;
  for ( i = 0 ;
  i < arr_size ;
  i ++ ) {
    int count = 0 ;
    for ( int j = 0 ;
    j < arr_size ;
    j ++ ) {
      if ( arr [ i ] == arr [ j ] ) count ++ ;
    }
    if ( count % 2 != 0 ) return arr [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
