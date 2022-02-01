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
public class N_TH_NUMBER_WHOSE_SUM_OF_DIGITS_IS_TEN_2{
public static int f_gold ( int n ) {
  int nthElement = 19 + ( n - 1 ) * 9 ;
  int outliersCount = ( int ) Math . log10 ( nthElement ) - 1 ;
  nthElement += 9 * outliersCount ;
  return nthElement ;
}


//TOFILL

}
