import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
import math

def f_gold ( a , b ) :
    AM = ( a + b ) / 2
    GM = math.sqrt ( a * b )
    HM = ( GM * GM ) / AM
    return HM


#TOFILL
