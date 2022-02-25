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
public class CALCULATE_VOLUME_DODECAHEDRON{
static double f_gold ( int side ) {
  return ( ( ( 15 + ( 7 * ( Math . sqrt ( 5 ) ) ) ) / 4 ) * ( Math . pow ( side , 3 ) ) ) ;
}


//TOFILL
public static void main(String args[]) throws IOException {
    int n_success = 0;
    List<Integer> param0 = new ArrayList<>();
    param0.add(56);
    param0.add(73);
    param0.add(22);
    param0.add(10);
    param0.add(84);
    param0.add(20);
    param0.add(51);
    param0.add(91);
    param0.add(10);
    param0.add(83);
    StringBuilder builder = new StringBuilder();
    builder.append("class,mutant,test_index,result\n");
    FileWriter writer = new FileWriter(args[0]);
    for(int i = 0; i < param0.size(); ++i)
    {
        try {
            builder.append("CALCULATE_VOLUME_DODECAHEDRON," + args[1] + "," + i + "," + f_gold(param0.get(i)) + "\n");
        } catch (Exception e) {
            builder.append("CALCULATE_VOLUME_DODECAHEDRON," + args[1] + "," + i + ",EXCEPTION\n");
        }
    }
    writer.write(builder.toString());
    writer.close();
}
}
