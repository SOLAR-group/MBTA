import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x ) :
    if ( x == 0 or x == 1 ) :
        return x
    start = 1
    end = x
    while ( start <= end ) :
        mid = ( start + end ) // 2
        if ( mid * mid == x ) :
            return mid
        if ( mid * mid < x ) :
            start = mid + 1
            ans = mid
        else :
            end = mid - 1
    return ans


#TOFILL
if __name__ == '__main__':
    param = [
    (40,),
    (10,),
    (46,),
    (54,),
    (1,),
    (67,),
    (64,),
    (10,),
    (75,),
    (11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SQUARE_ROOT_OF_AN_INTEGER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
