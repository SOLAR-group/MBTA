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
public class FIND_NUMBER_PAIRS_ARRAY_XOR_0{
static int f_gold ( int a [ ] , int n ) {
  Arrays . sort ( a ) ;
  int count = 1 ;
  int answer = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == a [ i - 1 ] ) {
      count += 1 ;
    }
    else {
      answer = answer + ( count * ( count - 1 ) ) / 2 ;
      count = 1 ;
    }
  }
  answer = answer + ( count * ( count - 1 ) ) / 2 ;
  return answer ;
}


//TOFILL

}
