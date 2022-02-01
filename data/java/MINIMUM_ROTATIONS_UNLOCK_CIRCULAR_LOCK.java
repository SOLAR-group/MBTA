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
public class MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK{
static int f_gold ( int input , int unlock_code ) {
  int rotation = 0 ;
  int input_digit , code_digit ;
  while ( input > 0 || unlock_code > 0 ) {
    input_digit = input % 10 ;
    code_digit = unlock_code % 10 ;
    rotation += Math . min ( Math . abs ( input_digit - code_digit ) , 10 - Math . abs ( input_digit - code_digit ) ) ;
    input /= 10 ;
    unlock_code /= 10 ;
  }
  return rotation ;
}


//TOFILL

}
