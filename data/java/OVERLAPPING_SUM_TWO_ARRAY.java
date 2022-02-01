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
public class OVERLAPPING_SUM_TWO_ARRAY{
static int f_gold ( int [ ] A , int [ ] B , int n ) {
  HashMap < Integer , Integer > hash = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( hash . containsKey ( A [ i ] ) ) hash . put ( A [ i ] , 1 + hash . get ( A [ i ] ) ) ;
    else hash . put ( A [ i ] , 1 ) ;
    if ( hash . containsKey ( B [ i ] ) ) hash . put ( B [ i ] , 1 + hash . get ( B [ i ] ) ) ;
    else hash . put ( B [ i ] , 1 ) ;
  }
  int sum = 0 ;
  for ( Map . Entry entry : hash . entrySet ( ) ) {
    if ( Integer . parseInt ( ( entry . getValue ( ) ) . toString ( ) ) == 1 ) sum += Integer . parseInt ( ( entry . getKey ( ) ) . toString ( ) ) ;
  }
  return sum ;
}


//TOFILL

}
