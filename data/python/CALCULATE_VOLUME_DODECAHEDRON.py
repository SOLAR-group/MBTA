import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    return ( ( ( 15 + ( 7 * ( math.sqrt ( 5 ) ) ) ) / 4 ) * ( math.pow ( side , 3 ) ) )


#TOFILL
if __name__ == '__main__':
    param = [
    (56,),
    (73,),
    (22,),
    (10,),
    (84,),
    (20,),
    (51,),
    (91,),
    (10,),
    (83,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_VOLUME_DODECAHEDRON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_VOLUME_DODECAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
