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
public class NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N{
static int f_gold ( int n ) {
  int result = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) for ( int j = 0 ;
  j <= n - i ;
  j ++ ) for ( int k = 0 ;
  k <= ( n - i - j ) ;
  k ++ ) if ( i + j + k == n ) result ++ ;
  return result ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(62);
    param0.add(44);
    param0.add(37);
    param0.add(81);
    param0.add(14);
    param0.add(20);
    param0.add(76);
    param0.add(72);
    param0.add(96);
    param0.add(52);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NUMBER_NON_NEGATIVE_INTEGRAL_SOLUTIONS_B_C_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
