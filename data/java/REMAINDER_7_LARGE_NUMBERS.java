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
public class REMAINDER_7_LARGE_NUMBERS{
static int f_gold ( String num ) {
  int series [ ] = {
    1 , 3 , 2 , - 1 , - 3 , - 2 };
    int series_index = 0 ;
    int result = 0 ;
    for ( int i = num . length ( ) - 1 ;
    i >= 0 ;
    i -- ) {
      int digit = num . charAt ( i ) - '0' ;
      result += digit * series [ series_index ] ;
      series_index = ( series_index + 1 ) % 6 ;
      result %= 7 ;
    }
    if ( result < 0 ) result = ( result + 7 ) % 7 ;
    return result ;
  }
  

//TOFILL

}
