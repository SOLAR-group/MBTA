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
public class HOW_TO_COMPUTE_MOD_OF_A_BIG_NUMBER{
static int f_gold ( String num , int a ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < num . length ( ) ;
  i ++ ) res = ( res * 10 + ( int ) num . charAt ( i ) - '0' ) % a ;
  return res ;
}


//TOFILL

}
