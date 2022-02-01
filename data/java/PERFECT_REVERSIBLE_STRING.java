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
public class PERFECT_REVERSIBLE_STRING{
static boolean f_gold ( String str ) {
  int i = 0 , j = str . length ( ) - 1 ;
  while ( i < j ) {
    if ( str . charAt ( i ) != str . charAt ( j ) ) return false ;
    i ++ ;
    j -- ;
  }
  return true ;
}


//TOFILL

}
