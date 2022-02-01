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
public class FIBONACCI_MODULO_P{
static int f_gold ( int p ) {
  int first = 1 , second = 1 , number = 2 , next = 1 ;
  while ( next > 0 ) {
    next = ( first + second ) % p ;
    first = second ;
    second = next ;
    number ++ ;
  }
  return number ;
}


//TOFILL

}
