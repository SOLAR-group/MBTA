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
public class SMALLEST_ELEMENT_REPEATED_EXACTLY_K_TIMES_NOT_LIMITED_SMALL_RANGE{
public static int f_gold ( int a [ ] , int n , int k ) {
  HashMap < Integer , Integer > m = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( m . containsKey ( a [ i ] ) ) m . put ( a [ i ] , m . get ( a [ i ] ) + 1 ) ;
  else m . put ( a [ i ] , 1 ) ;
  int res = Integer . MAX_VALUE ;
  Set < Integer > s = m . keySet ( ) ;
  for ( int temp : s ) if ( m . get ( temp ) == k ) res = Math . min ( res , temp ) ;
  return ( res != Integer . MAX_VALUE ) ? res : - 1 ;
}


//TOFILL

}
