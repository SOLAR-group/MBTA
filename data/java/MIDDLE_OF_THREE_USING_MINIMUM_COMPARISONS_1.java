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
public class MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1{
public static int f_gold ( int a , int b , int c ) {
  if ( a > b ) {
    if ( b > c ) return b ;
    else if ( a > c ) return c ;
    else return a ;
  }
  else {
    if ( a > c ) return a ;
    else if ( b > c ) return c ;
    else return b ;
  }
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(43);
    param0.add(76);
    param0.add(57);
    param0.add(10);
    param0.add(59);
    param0.add(92);
    param0.add(49);
    param0.add(16);
    param0.add(33);
    param0.add(66);
    List<Integer> param1 = new ArrayList<>();
    param1.add(24);
    param1.add(54);
    param1.add(5);
    param1.add(13);
    param1.add(47);
    param1.add(14);
    param1.add(62);
    param1.add(95);
    param1.add(41);
    param1.add(63);
    List<Integer> param2 = new ArrayList<>();
    param2.add(7);
    param2.add(66);
    param2.add(40);
    param2.add(4);
    param2.add(56);
    param2.add(50);
    param2.add(65);
    param2.add(12);
    param2.add(90);
    param2.add(46);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i),param2.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
