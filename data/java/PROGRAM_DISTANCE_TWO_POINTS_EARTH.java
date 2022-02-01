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
public class PROGRAM_DISTANCE_TWO_POINTS_EARTH{
public static double f_gold ( double lat1 , double lat2 , double lon1 , double lon2 ) {
  lon1 = Math . toRadians ( lon1 ) ;
  lon2 = Math . toRadians ( lon2 ) ;
  lat1 = Math . toRadians ( lat1 ) ;
  lat2 = Math . toRadians ( lat2 ) ;
  double dlon = lon2 - lon1 ;
  double dlat = lat2 - lat1 ;
  double a = Math . pow ( Math . sin ( dlat / 2 ) , 2 ) + Math . cos ( lat1 ) * Math . cos ( lat2 ) * Math . pow ( Math . sin ( dlon / 2 ) , 2 ) ;
  double c = 2 * Math . asin ( Math . sqrt ( a ) ) ;
  double r = 6371 ;
  return ( c * r ) ;
}


//TOFILL

}
