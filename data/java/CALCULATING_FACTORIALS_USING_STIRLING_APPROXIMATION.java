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
public class CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION{
public static int f_gold ( double n ) {
  if ( n == 1 ) return 1 ;
  double z ;
  double e = 2.71 ;
  z = Math . sqrt ( 2 * 3.14 * n ) * Math . pow ( ( n / e ) , n ) ;
  return ( int ) ( z ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(1.0);
    param0.add(5.0);
    param0.add(10.0);
    param0.add(20.0);
    param0.add(40.0);
    param0.add(2.0);
    param0.add(3.0);
    param0.add(-1.0);
    param0.add(4663.43115050185);
    param0.add(-3722.039522409859);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CALCULATING_FACTORIALS_USING_STIRLING_APPROXIMATION," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
