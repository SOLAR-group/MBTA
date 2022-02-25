import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( n ) :
    pPrevPrev , pPrev , pCurr , pNext = 1 , 1 , 1 , 1
    for i in range ( 3 , n + 1 ) :
        pNext = pPrevPrev + pPrev
        pPrevPrev = pPrev
        pPrev = pCurr
        pCurr = pNext
    return pNext ;


#TOFILL
if __name__ == '__main__':
    param = [
    (1,),
    (92,),
    (29,),
    (52,),
    (55,),
    (13,),
    (83,),
    (83,),
    (10,),
    (67,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PADOVAN_SEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
