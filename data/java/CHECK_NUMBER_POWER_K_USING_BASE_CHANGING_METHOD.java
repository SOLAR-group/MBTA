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
public class CHECK_NUMBER_POWER_K_USING_BASE_CHANGING_METHOD{
static boolean f_gold ( int n , int k ) {
  boolean oneSeen = false ;
  while ( n > 0 ) {
    int digit = n % k ;
    if ( digit > 1 ) return false ;
    if ( digit == 1 ) {
      if ( oneSeen ) return false ;
      oneSeen = true ;
    }
    n /= k ;
  }
  return true ;
}


//TOFILL

}
