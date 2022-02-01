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
public class RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY{
static int f_gold ( int arr [ ] , int l , int r , int x ) {
  if ( r < l ) return - 1 ;
  if ( arr [ l ] == x ) return l ;
  if ( arr [ r ] == x ) return r ;
  return f_gold ( arr , l + 1 , r - 1 , x ) ;
}


//TOFILL

}
