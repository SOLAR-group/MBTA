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
public class PRIMALITY_TEST_SET_5USING_LUCAS_LEHMER_SERIES{
static boolean f_gold ( int p ) {
  double checkNumber = Math . pow ( 2 , p ) - 1 ;
  double nextval = 4 % checkNumber ;
  for ( int i = 1 ;
  i < p - 1 ;
  i ++ ) nextval = ( nextval * nextval - 2 ) % checkNumber ;
  return ( nextval == 0 ) ;
}


//TOFILL

}
