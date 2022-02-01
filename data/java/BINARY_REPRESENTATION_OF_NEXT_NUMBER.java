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
public class BINARY_REPRESENTATION_OF_NEXT_NUMBER{
static String f_gold ( String num ) {
  int l = num . length ( ) ;
  int i ;
  for ( i = l - 1 ;
  i >= 0 ;
  i -- ) {
    if ( num . charAt ( i ) == '0' ) {
      num = num . substring ( 0 , i ) + '1' + num . substring ( i + 1 ) ;
      break ;
    }
    else {
      num = num . substring ( 0 , i ) + '0' + num . substring ( i + 1 ) ;
    }
  }
  if ( i < 0 ) {
    num = "1" + num ;
  }
  return num ;
}


//TOFILL

}
