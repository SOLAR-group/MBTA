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
public class DISTRIBUTING_ITEMS_PERSON_CANNOT_TAKE_TWO_ITEMS_TYPE{
static boolean f_gold ( int [ ] arr , int n , int k ) {
  int count ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    count = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( arr [ j ] == arr [ i ] ) count ++ ;
      if ( count > 2 * k ) return false ;
    }
  }
  return true ;
}


//TOFILL

}
