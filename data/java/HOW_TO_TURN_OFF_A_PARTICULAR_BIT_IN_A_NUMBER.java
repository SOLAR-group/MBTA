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
public class HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER{
static int f_gold ( int n , int k ) {
  if ( k <= 0 ) return n ;
  return ( n & ~ ( 1 << ( k - 1 ) ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(49);
    param0.add(59);
    param0.add(76);
    param0.add(27);
    param0.add(61);
    param0.add(67);
    param0.add(63);
    param0.add(85);
    param0.add(90);
    param0.add(24);
    List<Integer> param1 = new ArrayList<>();
    param1.add(15);
    param1.add(69);
    param1.add(20);
    param1.add(76);
    param1.add(60);
    param1.add(27);
    param1.add(71);
    param1.add(25);
    param1.add(64);
    param1.add(55);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("HOW_TO_TURN_OFF_A_PARTICULAR_BIT_IN_A_NUMBER," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
