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
public class CHECK_STRING_CAN_OBTAINED_ROTATING_ANOTHER_STRING_2_PLACES{
static boolean f_gold ( String str1 , String str2 ) {
  if ( str1 . length ( ) != str2 . length ( ) ) return false ;
  String clock_rot = "" ;
  String anticlock_rot = "" ;
  int len = str2 . length ( ) ;
  anticlock_rot = anticlock_rot + str2 . substring ( len - 2 , len ) + str2 . substring ( 0 , len - 2 ) ;
  clock_rot = clock_rot + str2 . substring ( 2 ) + str2 . substring ( 0 , 2 ) ;
  return ( str1 . equals ( clock_rot ) || str1 . equals ( anticlock_rot ) ) ;
}


//TOFILL

}
