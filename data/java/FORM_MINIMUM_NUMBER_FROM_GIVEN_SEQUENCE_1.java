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
public class FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE_1{
static String f_gold ( String seq ) {
  int n = seq . length ( ) ;
  if ( n >= 9 ) return "-1" ;
  char result [ ] = new char [ n + 1 ] ;
  int count = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    if ( i == n || seq . charAt ( i ) == 'I' ) {
      for ( int j = i - 1 ;
      j >= - 1 ;
      j -- ) {
        result [ j + 1 ] = ( char ) ( ( int ) '0' + count ++ ) ;
        if ( j >= 0 && seq . charAt ( j ) == 'I' ) break ;
      }
    }
  }
  return new String ( result ) ;
}


//TOFILL

}
