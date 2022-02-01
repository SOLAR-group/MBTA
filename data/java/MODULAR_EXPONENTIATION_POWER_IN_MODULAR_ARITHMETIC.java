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
public class MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC{
static int f_gold ( int x , int y , int p ) {
  int res = 1 ;
  x = x % p ;
  while ( y > 0 ) {
    if ( ( y & 1 ) == 1 ) res = ( res * x ) % p ;
    y = y >> 1 ;
    x = ( x * x ) % p ;
  }
  return res ;
}


//TOFILL

}
