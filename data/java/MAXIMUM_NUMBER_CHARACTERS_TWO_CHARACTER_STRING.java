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
public class MAXIMUM_NUMBER_CHARACTERS_TWO_CHARACTER_STRING{
static int f_gold ( String str ) {
  int n = str . length ( ) ;
  int res = - 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( str . charAt ( i ) == str . charAt ( j ) ) res = Math . max ( res , Math . abs ( j - i - 1 ) ) ;
  return res ;
}


//TOFILL

}
