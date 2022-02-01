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
public class CHECK_INTEGER_OVERFLOW_MULTIPLICATION{
static Boolean f_gold ( long a , long b ) {
  if ( a == 0 || b == 0 ) return false ;
  long result = a * b ;
  if ( a == result / b ) return false ;
  else return true ;
}


//TOFILL

}
