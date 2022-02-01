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
public class FIND_THE_ELEMENT_THAT_APPEARS_ONCE_2{
static int f_gold ( int a [ ] , int n ) {
  HashSet < Integer > s = new HashSet < Integer > ( ) ;
  for ( int i : a ) {
    s . add ( i ) ;
  }
  int arr_sum = 0 ;
  for ( int i : a ) {
    arr_sum += i ;
  }
  int set_sum = 0 ;
  for ( int i : s ) {
    set_sum += i ;
  }
  return ( 3 * set_sum - arr_sum ) / 2 ;
}


//TOFILL

}
