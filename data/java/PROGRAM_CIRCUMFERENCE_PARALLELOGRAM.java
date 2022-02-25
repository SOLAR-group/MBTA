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
public class PROGRAM_CIRCUMFERENCE_PARALLELOGRAM{
static float f_gold ( float a , float b ) {
  return ( ( 2 * a ) + ( 2 * b ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Float> param0 = new ArrayList<>();
    param0.add(801.0366882228715F);
    param0.add(-7069.610056819919F);
    param0.add(7723.966966568705F);
    param0.add(-7935.859205856963F);
    param0.add(6094.247432557289F);
    param0.add(-7371.490363309265F);
    param0.add(8368.473889617526F);
    param0.add(-3761.921143166053F);
    param0.add(3139.1089185587884F);
    param0.add(-5218.286665567171F);
    List<Float> param1 = new ArrayList<>();
    param1.add(456.71190645582783F);
    param1.add(-4226.483870778477F);
    param1.add(5894.65405158763F);
    param1.add(-5333.225064296693F);
    param1.add(1660.420120702062F);
    param1.add(-1095.4543576847332F);
    param1.add(4735.838330834498F);
    param1.add(-5315.871691690649F);
    param1.add(6490.194159517967F);
    param1.add(-8265.153014320813F);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("PROGRAM_CIRCUMFERENCE_PARALLELOGRAM," + args[1] + "," + i + "," + f_gold(param0.get(i),param1.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("PROGRAM_CIRCUMFERENCE_PARALLELOGRAM," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
