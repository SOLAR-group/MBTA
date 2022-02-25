import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    i = 1 ;
    res = 0.0 ;
    sign = True ;
    while ( n > 0 ) :
        n = n - 1 ;
        if ( sign ) :
            sign = False ;
            res = res + ( i + 1 ) / ( i + 2 ) ;
            i = i + 2 ;
        else :
            sign = True ;
            res = res - ( i + 1 ) / ( i + 2 ) ;
            i = i + 2 ;
    return res ;


#TOFILL
if __name__ == '__main__':
    param = [
    (49,),
    (4,),
    (60,),
    (90,),
    (96,),
    (29,),
    (86,),
    (47,),
    (77,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
