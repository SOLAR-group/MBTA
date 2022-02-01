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
public class PROGRAM_CENSOR_WORD_ASTERISKS_SENTENCE{
static String f_gold ( String text , String word ) {
  String [ ] word_list = text . split ( "\\s+" ) ;
  String result = "" ;
  String stars = "" ;
  for ( int i = 0 ;
  i < word . length ( ) ;
  i ++ ) stars += '*' ;
  int index = 0 ;
  for ( String i : word_list ) {
    if ( i . compareTo ( word ) == 0 ) word_list [ index ] = stars ;
    index ++ ;
  }
  for ( String i : word_list ) result += i + ' ' ;
  return result ;
}


//TOFILL

}
