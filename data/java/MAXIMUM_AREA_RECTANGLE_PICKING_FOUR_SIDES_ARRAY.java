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
public class MAXIMUM_AREA_RECTANGLE_PICKING_FOUR_SIDES_ARRAY{
static int f_gold ( Integer arr [ ] , int n ) {
  Arrays . sort ( arr , Collections . reverseOrder ( ) ) ;
  int [ ] dimension = {
    0 , 0 };
    for ( int i = 0 , j = 0 ;
    i < n - 1 && j < 2 ;
    i ++ ) if ( arr [ i ] == arr [ i + 1 ] ) dimension [ j ++ ] = arr [ i ++ ] ;
    return ( dimension [ 0 ] * dimension [ 1 ] ) ;
  }
  

//TOFILL

}
