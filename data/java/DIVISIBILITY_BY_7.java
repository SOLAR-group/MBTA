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
public class DIVISIBILITY_BY_7{
static boolean f_gold ( int num ) {
  if ( num < 0 ) return f_gold ( - num ) ;
  if ( num == 0 || num == 7 ) return true ;
  if ( num < 10 ) return false ;
  return f_gold ( num / 10 - 2 * ( num - num / 10 * 10 ) ) ;
}


//TOFILL

}
