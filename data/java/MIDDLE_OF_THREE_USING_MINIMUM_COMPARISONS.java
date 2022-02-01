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
public class MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS{
public static int f_gold ( int a , int b , int c ) {
  if ( ( a < b && b < c ) || ( c < b && b < a ) ) return b ;
  else if ( ( b < a && a < c ) || ( c < a && a < b ) ) return a ;
  else return c ;
}


//TOFILL

}
