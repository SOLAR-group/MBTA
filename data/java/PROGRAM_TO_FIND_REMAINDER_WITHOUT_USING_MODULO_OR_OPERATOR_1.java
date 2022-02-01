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
public class PROGRAM_TO_FIND_REMAINDER_WITHOUT_USING_MODULO_OR_OPERATOR_1{
static int f_gold ( int num , int divisor ) {
  if ( divisor == 0 ) {
    System . out . println ( "Error: divisor " + "can't be zero \n" ) ;
    return - 1 ;
  }
  if ( divisor < 0 ) divisor = - divisor ;
  if ( num < 0 ) num = - num ;
  int i = 1 ;
  int product = 0 ;
  while ( product <= num ) {
    product = divisor * i ;
    i ++ ;
  }
  return num - ( product - divisor ) ;
}


//TOFILL

}
