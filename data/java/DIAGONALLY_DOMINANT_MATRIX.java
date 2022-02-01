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
public class DIAGONALLY_DOMINANT_MATRIX{
static boolean f_gold ( int m [ ] [ ] , int n ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int sum = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) sum += Math . abs ( m [ i ] [ j ] ) ;
    sum -= Math . abs ( m [ i ] [ i ] ) ;
    if ( Math . abs ( m [ i ] [ i ] ) < sum ) return false ;
  }
  return true ;
}


//TOFILL

}
