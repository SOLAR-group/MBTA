# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( notes , n ) :
    fiveCount = 0
    tenCount = 0
    for i in range ( n ) :
        if ( notes [ i ] == 5 ) :
            fiveCount += 1
        elif ( notes [ i ] == 10 ) :
            if ( fiveCount > 0 ) :
                fiveCount -= 1
                tenCount += 1
            else :
                return 0
        else :
            if ( fiveCount > 0 and tenCount > 0 ) :
                fiveCount -= 1
                tenCount -= 1
            elif ( fiveCount >= 3 ) :
                fiveCount -= 3
            else :
                return 0
    return 1


#TOFILL
