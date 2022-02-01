# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( M , n , m ) :
    count = 0
    i = 0
    j = m - 1
    while j >= 0 and i < n :
        if M [ i ] [ j ] < 0 :
            count += ( j + 1 )
            i += 1
        else :
            j -= 1
    return count


#TOFILL
