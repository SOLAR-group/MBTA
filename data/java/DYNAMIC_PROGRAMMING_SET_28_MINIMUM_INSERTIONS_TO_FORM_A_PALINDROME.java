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
public class DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME{
static int f_gold ( char str [ ] , int l , int h ) {
  if ( l > h ) return Integer . MAX_VALUE ;
  if ( l == h ) return 0 ;
  if ( l == h - 1 ) return ( str [ l ] == str [ h ] ) ? 0 : 1 ;
  return ( str [ l ] == str [ h ] ) ? f_gold ( str , l + 1 , h - 1 ) : ( Integer . min ( f_gold ( str , l , h - 1 ) , f_gold ( str , l + 1 , h ) ) + 1 ) ;
}


//TOFILL

}
