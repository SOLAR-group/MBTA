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
public class MINIMUM_PERIMETER_N_BLOCKS{
public static long f_gold ( int n ) {
  int l = ( int ) Math . sqrt ( n ) ;
  int sq = l * l ;
  if ( sq == n ) return l * 4 ;
  else {
    long row = n / l ;
    long perimeter = 2 * ( l + row ) ;
    if ( n % l != 0 ) perimeter += 2 ;
    return perimeter ;
  }
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(45);
    param0.add(80);
    param0.add(54);
    param0.add(48);
    param0.add(83);
    param0.add(68);
    param0.add(32);
    param0.add(20);
    param0.add(68);
    param0.add(66);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MINIMUM_PERIMETER_N_BLOCKS," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MINIMUM_PERIMETER_N_BLOCKS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
