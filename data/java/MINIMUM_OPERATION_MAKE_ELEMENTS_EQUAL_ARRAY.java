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
public class MINIMUM_OPERATION_MAKE_ELEMENTS_EQUAL_ARRAY{
public static int f_gold ( int arr [ ] , int n ) {
  HashMap < Integer , Integer > hash = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( hash . containsKey ( arr [ i ] ) ) hash . put ( arr [ i ] , hash . get ( arr [ i ] ) + 1 ) ;
  else hash . put ( arr [ i ] , 1 ) ;
  int max_count = 0 ;
  Set < Integer > s = hash . keySet ( ) ;
  for ( int i : s ) if ( max_count < hash . get ( i ) ) max_count = hash . get ( i ) ;
  return ( n - max_count ) ;
}


//TOFILL

}
