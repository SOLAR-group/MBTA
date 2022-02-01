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
public class PROGRAM_FIND_STRING_START_END_GEEKS{
static boolean f_gold ( String str , String corner ) {
  int n = str . length ( ) ;
  int cl = corner . length ( ) ;
  if ( n < cl ) return false ;
  return ( str . substring ( 0 , cl ) . equals ( corner ) && str . substring ( n - cl , n ) . equals ( corner ) ) ;
}


//TOFILL

}
