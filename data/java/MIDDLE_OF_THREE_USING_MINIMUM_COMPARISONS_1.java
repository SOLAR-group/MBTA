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
public class MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1{
public static int f_gold ( int a , int b , int c ) {
  if ( a > b ) {
    if ( b > c ) return b ;
    else if ( a > c ) return c ;
    else return a ;
  }
  else {
    if ( a > c ) return a ;
    else if ( b > c ) return c ;
    else return b ;
  }
}


//TOFILL

}
