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
public class CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1{
static boolean f_gold ( int x , int y ) {
  int res1 = ( int ) Math . log ( y ) / ( int ) Math . log ( x ) ;
  double res2 = Math . log ( y ) / Math . log ( x ) ;
  return ( res1 == res2 ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(57);
    param0.add(3);
    param0.add(10);
    param0.add(10);
    param0.add(6);
    param0.add(2);
    param0.add(2);
    param0.add(20);
    param0.add(96);
    param0.add(25);
    List<Integer> param1 = new ArrayList<>();
    param1.add(1);
    param1.add(9);
    param1.add(101);
    param1.add(10000);
    param1.add(46656);
    param1.add(2048);
    param1.add(40);
    param1.add(79);
    param1.add(98);
    param1.add(5);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CHECK_IF_A_NUMBER_IS_POWER_OF_ANOTHER_NUMBER_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
