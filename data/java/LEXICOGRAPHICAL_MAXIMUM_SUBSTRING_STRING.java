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
public class LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING{
static String f_gold ( String str ) {
  String mx = "" ;
  for ( int i = 0 ;
  i < str . length ( ) ;
  ++ i ) {
    if ( mx . compareTo ( str . substring ( i ) ) <= 0 ) {
      mx = str . substring ( i ) ;
    }
  }
  return mx ;
}


//TOFILL

}
