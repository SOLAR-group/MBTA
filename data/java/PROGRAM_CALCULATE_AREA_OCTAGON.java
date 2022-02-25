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
public class PROGRAM_CALCULATE_AREA_OCTAGON{
static double f_gold ( double side ) {
  return ( float ) ( 2 * ( 1 + Math . sqrt ( 2 ) ) * side * side ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(5859.798616323926);
    param0.add(-6381.210375893524);
    param0.add(2442.246292006922);
    param0.add(-9624.81536339737);
    param0.add(8679.436805247444);
    param0.add(-2682.3245401089525);
    param0.add(7216.9161613024435);
    param0.add(-5881.789859815442);
    param0.add(2497.776395789202);
    param0.add(-9598.912195459263);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_CALCULATE_AREA_OCTAGON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_CALCULATE_AREA_OCTAGON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
