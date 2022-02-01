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
public class EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS{
static boolean f_gold ( int n , int p ) {
  n = n % p ;
  for ( int x = 2 ;
  x < p ;
  x ++ ) if ( ( x * x ) % p == n ) return true ;
  return false ;
}


//TOFILL

}
