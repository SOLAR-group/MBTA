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
public class NUMBER_DIGITS_REMOVED_MAKE_NUMBER_DIVISIBLE_3{
static int f_gold ( String num ) {
  int n = num . length ( ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sum += ( int ) ( num . charAt ( i ) ) ;
  if ( sum % 3 == 0 ) return 0 ;
  if ( n == 1 ) return - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( sum % 3 == ( num . charAt ( i ) - '0' ) % 3 ) return 1 ;
  if ( n == 2 ) return - 1 ;
  return 2 ;
}


//TOFILL

}