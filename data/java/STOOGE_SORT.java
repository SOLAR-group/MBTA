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
class STOOGE_SORT{
static void f_gold ( int arr [ ] , int l , int h ) {
  if ( l >= h ) return ;
  if ( arr [ l ] > arr [ h ] ) {
    int t = arr [ l ] ;
    arr [ l ] = arr [ h ] ;
    arr [ h ] = t ;
  }
  if ( h - l + 1 > 2 ) {
    int t = ( h - l + 1 ) / 3 ;
    f_gold ( arr , l , h - t ) ;
    f_gold ( arr , l + t , h ) ;
    f_gold ( arr , l , h - t ) ;
  }
}


//TOFILL

}
