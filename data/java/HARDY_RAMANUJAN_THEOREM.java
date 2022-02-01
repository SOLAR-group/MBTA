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
public class HARDY_RAMANUJAN_THEOREM{
static int f_gold ( int n ) {
  int count = 0 ;
  if ( n % 2 == 0 ) {
    count ++ ;
    while ( n % 2 == 0 ) n = n / 2 ;
  }
  for ( int i = 3 ;
  i <= Math . sqrt ( n ) ;
  i = i + 2 ) {
    if ( n % i == 0 ) {
      count ++ ;
      while ( n % i == 0 ) n = n / i ;
    }
  }
  if ( n > 2 ) count ++ ;
  return count ;
}


//TOFILL

}
