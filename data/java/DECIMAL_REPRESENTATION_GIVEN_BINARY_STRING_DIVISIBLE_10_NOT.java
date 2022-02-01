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
public class DECIMAL_REPRESENTATION_GIVEN_BINARY_STRING_DIVISIBLE_10_NOT{
static boolean f_gold ( String bin ) {
  int n = bin . length ( ) ;
  if ( bin . charAt ( n - 1 ) == '1' ) return false ;
  int sum = 0 ;
  for ( int i = n - 2 ;
  i >= 0 ;
  i -- ) {
    if ( bin . charAt ( i ) == '1' ) {
      int posFromRight = n - i - 1 ;
      if ( posFromRight % 4 == 1 ) sum = sum + 2 ;
      else if ( posFromRight % 4 == 2 ) sum = sum + 4 ;
      else if ( posFromRight % 4 == 3 ) sum = sum + 8 ;
      else if ( posFromRight % 4 == 0 ) sum = sum + 6 ;
    }
  }
  if ( sum % 10 == 0 ) return true ;
  return false ;
}


//TOFILL

}
