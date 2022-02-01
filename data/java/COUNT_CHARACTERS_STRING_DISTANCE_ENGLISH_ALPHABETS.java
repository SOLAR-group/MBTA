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
public class COUNT_CHARACTERS_STRING_DISTANCE_ENGLISH_ALPHABETS{
static int f_gold ( String str ) {
  int result = 0 ;
  int n = str . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = i + 1 ;
  j < n ;
  j ++ ) if ( Math . abs ( str . charAt ( i ) - str . charAt ( j ) ) == Math . abs ( i - j ) ) result ++ ;
  return result ;
}


//TOFILL

}
