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
public class TRIANGULAR_NUMBERS_1{
static boolean f_gold ( int num ) {
  if ( num < 0 ) return false ;
  int c = ( - 2 * num ) ;
  int b = 1 , a = 1 ;
  int d = ( b * b ) - ( 4 * a * c ) ;
  if ( d < 0 ) return false ;
  float root1 = ( - b + ( float ) Math . sqrt ( d ) ) / ( 2 * a ) ;
  float root2 = ( - b - ( float ) Math . sqrt ( d ) ) / ( 2 * a ) ;
  if ( root1 > 0 && Math . floor ( root1 ) == root1 ) return true ;
  if ( root2 > 0 && Math . floor ( root2 ) == root2 ) return true ;
  return false ;
}


//TOFILL

}
