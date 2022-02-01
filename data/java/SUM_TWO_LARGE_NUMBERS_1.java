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
public class SUM_TWO_LARGE_NUMBERS_1{
static String f_gold ( String str1 , String str2 ) {
  if ( str1 . length ( ) > str2 . length ( ) ) {
    String t = str1 ;
    str1 = str2 ;
    str2 = t ;
  }
  String str = "" ;
  int n1 = str1 . length ( ) , n2 = str2 . length ( ) ;
  int diff = n2 - n1 ;
  int carry = 0 ;
  for ( int i = n1 - 1 ;
  i >= 0 ;
  i -- ) {
    int sum = ( ( int ) ( str1 . charAt ( i ) - '0' ) + ( int ) ( str2 . charAt ( i + diff ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  for ( int i = n2 - n1 - 1 ;
  i >= 0 ;
  i -- ) {
    int sum = ( ( int ) ( str2 . charAt ( i ) - '0' ) + carry ) ;
    str += ( char ) ( sum % 10 + '0' ) ;
    carry = sum / 10 ;
  }
  if ( carry > 0 ) str += ( char ) ( carry + '0' ) ;
  return new StringBuilder ( str ) . reverse ( ) . toString ( ) ;
}


//TOFILL

}
