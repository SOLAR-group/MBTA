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
class POSITIVE_ELEMENTS_EVEN_NEGATIVE_ODD_POSITIONS{
static void f_gold ( int a [ ] , int size ) {
  int positive = 0 , negative = 1 , temp ;
  while ( true ) {
    while ( positive < size && a [ positive ] >= 0 ) positive += 2 ;
    while ( negative < size && a [ negative ] <= 0 ) negative += 2 ;
    if ( positive < size && negative < size ) {
      temp = a [ positive ] ;
      a [ positive ] = a [ negative ] ;
      a [ negative ] = temp ;
    }
    else break ;
  }
}


//TOFILL

}
