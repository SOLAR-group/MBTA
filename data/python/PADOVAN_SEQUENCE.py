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
