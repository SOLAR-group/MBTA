import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    return ( n * ( n - 1 ) * ( n - 2 ) // 6 )


#TOFILL
if __name__ == '__main__':
    param = [
    (67,),
    (58,),
    (67,),
    (60,),
    (4,),
    (97,),
    (9,),
    (16,),
    (83,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("NUMBER_OF_TRIANGLES_IN_A_PLANE_IF_NO_MORE_THAN_TWO_POINTS_ARE_COLLINEAR," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
