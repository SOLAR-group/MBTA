import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( a , b ) :
    if ( a < 0 ) :
        a = - a
    if ( b < 0 ) :
        b = - b
    mod = a
    while ( mod >= b ) :
        mod = mod - b
    if ( a < 0 ) :
        return - mod
    return mod


#TOFILL
if __name__ == '__main__':
    param = [
    (3243.229719038493,5659.926861939672,),
    (-4362.665881044217,-9196.507113304497,),
    (7255.066257575837,2623.200060506935,),
    (-6929.554320261099,-3009.0234530313287,),
    (3569.942027998315,6920.809419868375,),
    (-6513.849053096595,-70.95992406437102,),
    (7333.183189243961,580.3500610971768,),
    (-2856.1752826258803,-9625.97442825802,),
    (9787.228111241662,2419.6844962423256,),
    (-1722.873699288031,-8370.700544254058,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MODULUS_TWO_FLOAT_DOUBLE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MODULUS_TWO_FLOAT_DOUBLE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
