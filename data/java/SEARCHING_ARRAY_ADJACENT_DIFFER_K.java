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
public class SEARCHING_ARRAY_ADJACENT_DIFFER_K{
static int f_gold ( int arr [ ] , int n , int x , int k ) {
  int i = 0 ;
  while ( i < n ) {
    if ( arr [ i ] == x ) return i ;
    i = i + Math . max ( 1 , Math . abs ( arr [ i ] - x ) / k ) ;
  }
  System . out . println ( "number is " + "not present!" ) ;
  return - 1 ;
}


//TOFILL

}
