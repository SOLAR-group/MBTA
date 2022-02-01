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
public class MAKING_ELEMENTS_OF_TWO_ARRAYS_SAME_WITH_MINIMUM_INCREMENTDECREMENT{
static int f_gold ( int a [ ] , int b [ ] , int n ) {
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    if ( a [ i ] > b [ i ] ) result = result + Math . abs ( a [ i ] - b [ i ] ) ;
    else if ( a [ i ] < b [ i ] ) result = result + Math . abs ( a [ i ] - b [ i ] ) ;
  }
  return result ;
}


//TOFILL

}
