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
public class FIND_THE_ELEMENT_THAT_APPEARS_ONCE{
static int f_gold ( int arr [ ] , int n ) {
  int ones = 0 , twos = 0 ;
  int common_bit_mask ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    twos = twos | ( ones & arr [ i ] ) ;
    ones = ones ^ arr [ i ] ;
    common_bit_mask = ~ ( ones & twos ) ;
    ones &= common_bit_mask ;
    twos &= common_bit_mask ;
  }
  return ones ;
}


//TOFILL

}
