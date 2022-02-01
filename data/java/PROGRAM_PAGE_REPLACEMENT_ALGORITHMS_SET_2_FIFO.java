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
public class PROGRAM_PAGE_REPLACEMENT_ALGORITHMS_SET_2_FIFO{
static int f_gold ( int pages [ ] , int n , int capacity ) {
  HashSet < Integer > s = new HashSet < > ( capacity ) ;
  Queue < Integer > indexes = new LinkedList < > ( ) ;
  int page_faults = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . size ( ) < capacity ) {
      if ( ! s . contains ( pages [ i ] ) ) {
        s . add ( pages [ i ] ) ;
        page_faults ++ ;
        indexes . add ( pages [ i ] ) ;
      }
    }
    else {
      if ( ! s . contains ( pages [ i ] ) ) {
        int val = indexes . peek ( ) ;
        indexes . poll ( ) ;
        s . remove ( val ) ;
        s . add ( pages [ i ] ) ;
        indexes . add ( pages [ i ] ) ;
        page_faults ++ ;
      }
    }
  }
  return page_faults ;
}


//TOFILL

}
