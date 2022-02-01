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
public class COUNT_OPERATIONS_MAKE_STRINGAB_FREE{
static int f_gold ( char [ ] s ) {
  int b_count = 0 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s [ s . length - i - 1 ] == 'a' ) {
      res = ( res + b_count ) ;
      b_count = ( b_count * 2 ) ;
    }
    else {
      b_count += 1 ;
    }
  }
  return res ;
}


//TOFILL

}
