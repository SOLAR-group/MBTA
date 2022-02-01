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
public class ARRAY_RANGE_QUERIES_ELEMENTS_FREQUENCY_VALUE{
static int f_gold ( int start , int end , int arr [ ] ) {
  Map < Integer , Integer > mp = new HashMap < > ( ) ;
  for ( int i = start ;
  i <= end ;
  i ++ ) mp . put ( arr [ i ] , mp . get ( arr [ i ] ) == null ? 1 : mp . get ( arr [ i ] ) + 1 ) ;
  int count = 0 ;
  for ( Map . Entry < Integer , Integer > entry : mp . entrySet ( ) ) if ( entry . getKey ( ) == entry . getValue ( ) ) count ++ ;
  return count ;
}


//TOFILL

}
