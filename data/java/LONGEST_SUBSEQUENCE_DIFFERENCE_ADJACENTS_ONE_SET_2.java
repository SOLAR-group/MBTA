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
public class LONGEST_SUBSEQUENCE_DIFFERENCE_ADJACENTS_ONE_SET_2{
static int f_gold ( int [ ] arr , int n ) {
  HashMap < Integer , Integer > um = new HashMap < Integer , Integer > ( ) ;
  int longLen = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int len = 0 ;
    if ( um . containsKey ( arr [ i ] - 1 ) && len < um . get ( arr [ i ] - 1 ) ) len = um . get ( arr [ i ] - 1 ) ;
    if ( um . containsKey ( arr [ i ] + 1 ) && len < um . get ( arr [ i ] + 1 ) ) len = um . get ( arr [ i ] + 1 ) ;
    um . put ( arr [ i ] , len + 1 ) ;
    if ( longLen < um . get ( arr [ i ] ) ) longLen = um . get ( arr [ i ] ) ;
  }
  return longLen ;
}


//TOFILL

}
