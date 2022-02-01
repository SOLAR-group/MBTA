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
public class POSSIBLE_FORM_TRIANGLE_ARRAY_VALUES{
static boolean f_gold ( int [ ] arr , int N ) {
  if ( N < 3 ) return false ;
  Arrays . sort ( arr ) ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) if ( arr [ i ] + arr [ i + 1 ] > arr [ i + 2 ] ) return true ;
  return false ;
}


//TOFILL

}
