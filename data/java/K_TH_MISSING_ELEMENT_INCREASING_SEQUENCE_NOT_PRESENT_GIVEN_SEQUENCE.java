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
public class K_TH_MISSING_ELEMENT_INCREASING_SEQUENCE_NOT_PRESENT_GIVEN_SEQUENCE{
static int f_gold ( int a [ ] , int b [ ] , int k , int n1 , int n2 ) {
  LinkedHashSet < Integer > s = new LinkedHashSet < > ( ) ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) s . add ( b [ i ] ) ;
  int missing = 0 ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    if ( ! s . contains ( a [ i ] ) ) missing ++ ;
    if ( missing == k ) return a [ i ] ;
  }
  return - 1 ;
}


//TOFILL

}
