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
public class NUMBER_SUBSEQUENCES_FORM_AI_BJ_CK{
static int f_gold ( String s ) {
  int aCount = 0 ;
  int bCount = 0 ;
  int cCount = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'a' ) aCount = ( 1 + 2 * aCount ) ;
    else if ( s . charAt ( i ) == 'b' ) bCount = ( aCount + 2 * bCount ) ;
    else if ( s . charAt ( i ) == 'c' ) cCount = ( bCount + 2 * cCount ) ;
  }
  return cCount ;
}


//TOFILL

}
