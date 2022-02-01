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
public class TAIL_RECURSION_FIBONACCI{
static int f_gold ( int n , int a , int b ) {
  if ( n == 0 ) return a ;
  if ( n == 1 ) return b ;
  return f_gold ( n - 1 , b , a + b ) ;
}


//TOFILL

}
