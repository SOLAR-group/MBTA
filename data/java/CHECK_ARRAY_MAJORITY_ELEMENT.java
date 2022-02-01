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
public class CHECK_ARRAY_MAJORITY_ELEMENT{
static boolean f_gold ( int a [ ] , int n ) {
  HashMap < Integer , Integer > mp = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( mp . containsKey ( a [ i ] ) ) mp . put ( a [ i ] , mp . get ( a [ i ] ) + 1 ) ;
  else mp . put ( a [ i ] , 1 ) ;
  for ( Map . Entry < Integer , Integer > x : mp . entrySet ( ) ) if ( x . getValue ( ) >= n / 2 ) return true ;
  return false ;
}


//TOFILL

}
