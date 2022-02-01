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
public class NUMBER_VISIBLE_BOXES_PUTTING_ONE_INSIDE_ANOTHER{
static int f_gold ( int [ ] arr , int n ) {
  Queue < Integer > q = new LinkedList < > ( ) ;
  Arrays . sort ( arr ) ;
  q . add ( arr [ 0 ] ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int now = q . element ( ) ;
    if ( arr [ i ] >= 2 * now ) q . remove ( ) ;
    q . add ( arr [ i ] ) ;
  }
  return q . size ( ) ;
}


//TOFILL

}
