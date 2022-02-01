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
public class WRITE_A_C_PROGRAM_TO_CALCULATE_POWXN{
static int f_gold ( int x , int y ) {
  if ( y == 0 ) return 1 ;
  else if ( y % 2 == 0 ) return f_gold ( x , y / 2 ) * f_gold ( x , y / 2 ) ;
  else return x * f_gold ( x , y / 2 ) * f_gold ( x , y / 2 ) ;
}


//TOFILL

}
