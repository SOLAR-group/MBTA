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
public class SUM_OF_ALL_SUBSTRINGS_OF_A_STRING_REPRESENTING_A_NUMBER{
public static int f_gold ( String num ) {
  int n = num . length ( ) ;
  int sumofdigit [ ] = new int [ n ] ;
  sumofdigit [ 0 ] = num . charAt ( 0 ) - '0' ;
  int res = sumofdigit [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int numi = num . charAt ( i ) - '0' ;
    sumofdigit [ i ] = ( i + 1 ) * numi + 10 * sumofdigit [ i - 1 ] ;
    res += sumofdigit [ i ] ;
  }
  return res ;
}


//TOFILL

}
