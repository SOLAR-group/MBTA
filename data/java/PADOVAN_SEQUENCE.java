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
public class PADOVAN_SEQUENCE{
static int f_gold ( int n ) {
  int pPrevPrev = 1 , pPrev = 1 , pCurr = 1 , pNext = 1 ;
  for ( int i = 3 ;
  i <= n ;
  i ++ ) {
    pNext = pPrevPrev + pPrev ;
    pPrevPrev = pPrev ;
    pPrev = pCurr ;
    pCurr = pNext ;
  }
  return pNext ;
}


//TOFILL

}
