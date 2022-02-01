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
public class EFFICIENTLY_FIND_FIRST_REPEATED_CHARACTER_STRING_WITHOUT_USING_ADDITIONAL_DATA_STRUCTURE_ONE_TRAVERSAL{
static int f_gold ( String str ) {
  int checker = 0 ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  ++ i ) {
    int val = ( str . charAt ( i ) - 'a' ) ;
    if ( ( checker & ( 1 << val ) ) > 0 ) return i ;
    checker |= ( 1 << val ) ;
  }
  return - 1 ;
}


//TOFILL

}
