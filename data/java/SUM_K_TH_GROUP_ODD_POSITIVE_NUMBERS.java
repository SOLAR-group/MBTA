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
public class SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS{
public static int f_gold ( int k ) {
  int cur = ( k * ( k - 1 ) ) + 1 ;
  int sum = 0 ;
  while ( k -- > 0 ) {
    sum += cur ;
    cur += 2 ;
  }
  return sum ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(91);
    param0.add(52);
    param0.add(78);
    param0.add(51);
    param0.add(65);
    param0.add(39);
    param0.add(42);
    param0.add(12);
    param0.add(56);
    param0.add(98);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("SUM_K_TH_GROUP_ODD_POSITIVE_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
