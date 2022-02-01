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
public class DIVISIBILITY_9_USING_BITWISE_OPERATORS{
static boolean f_gold ( int n ) {
  if ( n == 0 || n == 9 ) return true ;
  if ( n < 9 ) return false ;
  return f_gold ( ( int ) ( n >> 3 ) - ( int ) ( n & 7 ) ) ;
}


//TOFILL

}
