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
class CHANGE_ARRAY_PERMUTATION_NUMBERS_1_N{
static void f_gold ( int [ ] a , int n ) {
  TEST
}

//TOFILL

public static void main(String args[]) {
    int n_success = 0;
    List<int [ ]> param0 = new ArrayList<>();
    param0.add(new int[]{19});
    TEST_PARAMS_0
    List<Integer> param1 = new ArrayList<>();
    param1.add(0);
    TEST_PARAMS_1

    for(int i = 0; i < param0.size(); ++i)
    {
        TEST_FOR_0
        if(f_filled(param0.get(i),param1.get(i)) == f_gold(param0.get(i),param1.get(i)))
        {
            TEST_FOR_1
            n_success+=1;
        }
    }
    System.out.println("#Results:" + n_success + ", " + param0.size());
}
}