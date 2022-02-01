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
public class NUMBER_TRIANGLES_N_MOVES{
public static int f_gold ( int n ) {
  int [ ] answer = new int [ n + 1 ] ;
  answer [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) answer [ i ] = answer [ i - 1 ] * 3 + 2 ;
  return answer [ n ] ;
}


//TOFILL

}
