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
public class MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2{
public static int f_gold ( int a , int b , int c ) {
  int x = a - b ;
  int y = b - c ;
  int z = a - c ;
  if ( x * y > 0 ) return b ;
  else if ( x * z > 0 ) return c ;
  else return a ;
}


//TOFILL

}
