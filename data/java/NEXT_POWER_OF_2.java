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
public class NEXT_POWER_OF_2{
static int f_gold ( int n ) {
  int count = 0 ;
  if ( n > 0 && ( n & ( n - 1 ) ) == 0 ) return n ;
  while ( n != 0 ) {
    n >>= 1 ;
    count += 1 ;
  }
  return 1 << count ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(74);
    param0.add(70);
    param0.add(85);
    param0.add(78);
    param0.add(71);
    param0.add(32);
    param0.add(97);
    param0.add(90);
    param0.add(64);
    param0.add(48);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("NEXT_POWER_OF_2," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("NEXT_POWER_OF_2," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
