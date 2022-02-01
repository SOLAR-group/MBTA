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
public class CIRCLE_LATTICE_POINTS{
static int f_gold ( int r ) {
  if ( r <= 0 ) return 0 ;
  int result = 4 ;
  for ( int x = 1 ;
  x < r ;
  x ++ ) {
    int ySquare = r * r - x * x ;
    int y = ( int ) Math . sqrt ( ySquare ) ;
    if ( y * y == ySquare ) result += 4 ;
  }
  return result ;
}


//TOFILL

}
