import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( side ) :
    volume = ( side ** 3 / ( 6 * math.sqrt ( 2 ) ) )
    return round ( volume , 2 )


#TOFILL
if __name__ == '__main__':
    param = [
    (58,),
    (56,),
    (35,),
    (99,),
    (13,),
    (45,),
    (40,),
    (92,),
    (7,),
    (13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_AREA_TETRAHEDRON," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
