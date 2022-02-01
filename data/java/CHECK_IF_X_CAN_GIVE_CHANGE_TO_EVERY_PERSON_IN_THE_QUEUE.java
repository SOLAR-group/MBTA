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
public class CHECK_IF_X_CAN_GIVE_CHANGE_TO_EVERY_PERSON_IN_THE_QUEUE{
static int f_gold ( int notes [ ] , int n ) {
  int fiveCount = 0 ;
  int tenCount = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( notes [ i ] == 5 ) fiveCount ++ ;
    else if ( notes [ i ] == 10 ) {
      if ( fiveCount > 0 ) {
        fiveCount -- ;
        tenCount ++ ;
      }
      else return 0 ;
    }
    else {
      if ( fiveCount > 0 && tenCount > 0 ) {
        fiveCount -- ;
        tenCount -- ;
      }
      else if ( fiveCount >= 3 ) {
        fiveCount -= 3 ;
      }
      else return 0 ;
    }
  }
  return 1 ;
}


//TOFILL

}
