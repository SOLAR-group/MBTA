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
public class MARKOV_MATRIX{
static boolean f_gold ( double m [ ] [ ] ) {
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    double sum = 0 ;
    for ( int j = 0 ;
    j < m [ i ] . length ;
    j ++ ) sum = sum + m [ i ] [ j ] ;
    if ( sum != 1 ) return false ;
  }
  return true ;
}


//TOFILL

}
