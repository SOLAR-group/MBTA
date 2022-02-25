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
public class FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1{
static int f_gold ( int N , int K ) {
  int ans = 0 ;
  int y = N / K ;
  int x = N % K ;
  ans = ( K * ( K - 1 ) / 2 ) * y + ( x * ( x + 1 ) ) / 2 ;
  return ans ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(40);
    param0.add(46);
    param0.add(97);
    param0.add(63);
    param0.add(92);
    param0.add(60);
    param0.add(67);
    param0.add(61);
    param0.add(74);
    param0.add(67);
    List<Integer> param1 = new ArrayList<>();
    param1.add(90);
    param1.add(64);
    param1.add(20);
    param1.add(1);
    param1.add(52);
    param1.add(35);
    param1.add(40);
    param1.add(62);
    param1.add(61);
    param1.add(41);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FIND_SUM_MODULO_K_FIRST_N_NATURAL_NUMBER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
