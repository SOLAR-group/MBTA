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
public class FINDING_POWER_PRIME_NUMBER_P_N{
static int f_gold ( int n , int p ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int count = 0 , temp = i ;
    while ( temp % p == 0 ) {
      count ++ ;
      temp = temp / p ;
    }
    ans += count ;
  }
  return ans ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(49);
    param0.add(80);
    param0.add(10);
    param0.add(81);
    param0.add(11);
    param0.add(45);
    param0.add(86);
    param0.add(27);
    param0.add(80);
    param0.add(97);
    List<Integer> param1 = new ArrayList<>();
    param1.add(30);
    param1.add(25);
    param1.add(9);
    param1.add(57);
    param1.add(4);
    param1.add(34);
    param1.add(90);
    param1.add(78);
    param1.add(60);
    param1.add(31);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("FINDING_POWER_PRIME_NUMBER_P_N," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("FINDING_POWER_PRIME_NUMBER_P_N," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
