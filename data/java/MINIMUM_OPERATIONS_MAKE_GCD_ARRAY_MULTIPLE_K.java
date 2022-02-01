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
public class MINIMUM_OPERATIONS_MAKE_GCD_ARRAY_MULTIPLE_K{
static int f_gold ( int a [ ] , int n , int k ) {
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    if ( a [ i ] != 1 && a [ i ] > k ) {
      result = result + Math . min ( a [ i ] % k , k - a [ i ] % k ) ;
    }
    else {
      result = result + k - a [ i ] ;
    }
  }
  return result ;
}


//TOFILL

}
