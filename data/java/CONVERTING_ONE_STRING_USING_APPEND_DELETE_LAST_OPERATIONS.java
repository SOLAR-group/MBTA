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
public class CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS{
static boolean f_gold ( String str1 , String str2 , int k ) {
  if ( ( str1 . length ( ) + str2 . length ( ) ) < k ) return true ;
  int commonLength = 0 ;
  for ( int i = 0 ;
  i < Math . min ( str1 . length ( ) , str2 . length ( ) ) ;
  i ++ ) {
    if ( str1 == str2 ) commonLength ++ ;
    else break ;
  }
  if ( ( k - str1 . length ( ) - str2 . length ( ) + 2 * commonLength ) % 2 == 0 ) return true ;
  return false ;
}


//TOFILL

}
