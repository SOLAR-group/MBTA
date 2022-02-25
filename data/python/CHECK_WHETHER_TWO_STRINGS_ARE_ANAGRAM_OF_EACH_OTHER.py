import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold ( str1 , str2 ) :
    n1 = len ( str1 )
    n2 = len ( str2 )
    if n1 != n2 :
        return 0
    str1 = sorted ( str1 )
    str2 = sorted ( str2 )
    for i in range ( 0 , n1 ) :
        if str1 [ i ] != str2 [ i ] :
            return 0
    return 1


#TOFILL
if __name__ == '__main__':
    param = [
    (['LISTEN'],['SILENT'],),
    (['TRIANGLE'],['INTEGRAL'],),
    (['test'],['ttew'],),
    (['night'],['thing'],),
    (['Inch'],['Study'],),
    (['Dusty'],['1'],),
    (['GJLMOOSTTXaabceefgllpwz'],['EJRXYajoy'],),
    (['41658699122772743330'],['9931020'],),
    (['0000000000000000000000001111111111111111111'],['0000000000000000000001111111111111111111111'],),
    (['ERioPYDqgTSz bVCW'],['GLajZE'],)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CHECK_WHETHER_TWO_STRINGS_ARE_ANAGRAM_OF_EACH_OTHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
