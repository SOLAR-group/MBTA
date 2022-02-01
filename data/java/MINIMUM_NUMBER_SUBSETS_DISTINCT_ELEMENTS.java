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
public class MINIMUM_NUMBER_SUBSETS_DISTINCT_ELEMENTS{
public static int f_gold ( int ar [ ] , int n ) {
  int res = 0 ;
  Arrays . sort ( ar ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int count = 1 ;
    for ( ;
    i < n - 1 ;
    i ++ ) {
      if ( ar [ i ] == ar [ i + 1 ] ) count ++ ;
      else break ;
    }
    res = Math . max ( res , count ) ;
  }
  return res ;
}


//TOFILL

}
