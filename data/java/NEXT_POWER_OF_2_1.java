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
public class NEXT_POWER_OF_2_1{
static int f_gold ( int n ) {
  int p = 1 ;
  if ( n > 0 && ( n & ( n - 1 ) ) == 0 ) return n ;
  while ( p < n ) p <<= 1 ;
  return p ;
}


//TOFILL

}
