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
class FUNCTION_COPY_STRING_ITERATIVE_RECURSIVE_1{
static void f_gold ( char s1 [ ] , char s2 [ ] , int index ) {
  s2 [ index ] = s1 [ index ] ;
  if ( index == s1 . length - 1 ) {
    return ;
  }
  f_gold ( s1 , s2 , index + 1 ) ;
}


//TOFILL

}
