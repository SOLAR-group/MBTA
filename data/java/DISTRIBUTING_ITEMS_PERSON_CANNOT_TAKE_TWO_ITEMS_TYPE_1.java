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
public class DISTRIBUTING_ITEMS_PERSON_CANNOT_TAKE_TWO_ITEMS_TYPE_1{
static boolean f_gold ( int arr [ ] , int n , int k ) {
  HashMap < Integer , Integer > hash = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! hash . containsKey ( arr [ i ] ) ) hash . put ( arr [ i ] , 0 ) ;
    hash . put ( arr [ i ] , hash . get ( arr [ i ] ) + 1 ) ;
  }
  for ( Map . Entry x : hash . entrySet ( ) ) if ( ( int ) x . getValue ( ) > 2 * k ) return false ;
  return true ;
}


//TOFILL

}
