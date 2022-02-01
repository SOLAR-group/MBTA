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
public class FIND_POSITION_GIVEN_NUMBER_AMONG_NUMBERS_MADE_4_7{
static int f_gold ( String n ) {
  int k = 0 , pos = 0 , i = 0 ;
  while ( k != n . length ( ) ) {
    switch ( n . charAt ( i ) ) {
      case '4' : pos = pos * 2 + 1 ;
      break ;
      case '7' : pos = pos * 2 + 2 ;
      break ;
    }
    i ++ ;
    k ++ ;
  }
  return pos ;
}


//TOFILL

}
