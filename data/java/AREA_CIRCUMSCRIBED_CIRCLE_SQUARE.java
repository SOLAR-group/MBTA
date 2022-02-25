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
public class AREA_CIRCUMSCRIBED_CIRCLE_SQUARE{
static float f_gold ( float a ) {
  float PI = 3.14159265f ;
  return ( a * a * ( PI / 2 ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(3296.590241413969F);
    param0.add(-1688.6061770081972F);
    param0.add(1571.9067680023313F);
    param0.add(-3117.129927920369F);
    param0.add(8561.027934208052F);
    param0.add(-5052.211066243729F);
    param0.add(3601.752337206948F);
    param0.add(-651.9008970363393F);
    param0.add(4415.044414999076F);
    param0.add(-1453.219956352866F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("AREA_CIRCUMSCRIBED_CIRCLE_SQUARE," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("AREA_CIRCUMSCRIBED_CIRCLE_SQUARE," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
