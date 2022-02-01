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
public class NUMBER_IS_DIVISIBLE_BY_29_OR_NOT{
static boolean f_gold ( long n ) {
  while ( n / 100 > 0 ) {
    int last_digit = ( int ) n % 10 ;
    n /= 10 ;
    n += last_digit * 3 ;
  }
  return ( n % 29 == 0 ) ;
}


//TOFILL

}
