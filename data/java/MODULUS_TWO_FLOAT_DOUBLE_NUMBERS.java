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
public class MODULUS_TWO_FLOAT_DOUBLE_NUMBERS{
static double f_gold ( double a , double b ) {
  if ( a < 0 ) a = - a ;
  if ( b < 0 ) b = - b ;
  double mod = a ;
  while ( mod >= b ) mod = mod - b ;
  if ( a < 0 ) return - mod ;
  return mod ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Double> param0 = new ArrayList<>();
    param0.add(3243.229719038493);
    param0.add(-4362.665881044217);
    param0.add(7255.066257575837);
    param0.add(-6929.554320261099);
    param0.add(3569.942027998315);
    param0.add(-6513.849053096595);
    param0.add(7333.183189243961);
    param0.add(-2856.1752826258803);
    param0.add(9787.228111241662);
    param0.add(-1722.873699288031);
    List<Double> param1 = new ArrayList<>();
    param1.add(5659.926861939672);
    param1.add(-9196.507113304497);
    param1.add(2623.200060506935);
    param1.add(-3009.0234530313287);
    param1.add(6920.809419868375);
    param1.add(-70.95992406437102);
    param1.add(580.3500610971768);
    param1.add(-9625.97442825802);
    param1.add(2419.6844962423256);
    param1.add(-8370.700544254058);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("MODULUS_TWO_FLOAT_DOUBLE_NUMBERS," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("MODULUS_TWO_FLOAT_DOUBLE_NUMBERS," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
