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
public class RECURSIVELY_BREAK_NUMBER_3_PARTS_GET_MAXIMUM_SUM{
static int f_gold ( int n ) {
  if ( n == 0 || n == 1 ) return n ;
  return Math . max ( ( f_gold ( n / 2 ) + f_gold ( n / 3 ) + f_gold ( n / 4 ) ) , n ) ;
}


//TOFILL

}
