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
public class SEQUENCES_GIVEN_LENGTH_EVERY_ELEMENT_EQUAL_TWICE_PREVIOUS{
static int f_gold ( int m , int n ) {
  if ( m < n ) return 0 ;
  if ( n == 0 ) return 1 ;
  return f_gold ( m - 1 , n ) + f_gold ( m / 2 , n - 1 ) ;
}


//TOFILL

}
