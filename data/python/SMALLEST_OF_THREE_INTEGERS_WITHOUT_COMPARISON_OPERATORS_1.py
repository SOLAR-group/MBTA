import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( x , y , z ) :
    if ( not ( y / x ) ) :
        return y if ( not ( y / z ) ) else z
    return x if ( not ( x / z ) ) else z


#TOFILL
