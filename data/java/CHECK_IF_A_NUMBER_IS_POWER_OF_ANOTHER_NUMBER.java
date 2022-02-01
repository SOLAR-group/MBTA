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
public class CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER{
public static boolean f_gold ( int x , int y ) {
  if ( x == 1 ) return ( y == 1 ) ;
  int pow = 1 ;
  while ( pow < y ) pow = pow * x ;
  return ( pow == y ) ;
}


//TOFILL

}
