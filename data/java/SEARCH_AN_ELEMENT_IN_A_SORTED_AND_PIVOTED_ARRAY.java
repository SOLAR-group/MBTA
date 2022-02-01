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
public class SEARCH_AN_ELEMENT_IN_A_SORTED_AND_PIVOTED_ARRAY{
static int f_gold ( int arr [ ] , int l , int h , int key ) {
  if ( l > h ) return - 1 ;
  int mid = ( l + h ) / 2 ;
  if ( arr [ mid ] == key ) return mid ;
  if ( arr [ l ] <= arr [ mid ] ) {
    if ( key >= arr [ l ] && key <= arr [ mid ] ) return f_gold ( arr , l , mid - 1 , key ) ;
    return f_gold ( arr , mid + 1 , h , key ) ;
  }
  if ( key >= arr [ mid ] && key <= arr [ h ] ) return f_gold ( arr , mid + 1 , h , key ) ;
  return f_gold ( arr , l , mid - 1 , key ) ;
}


//TOFILL

}
