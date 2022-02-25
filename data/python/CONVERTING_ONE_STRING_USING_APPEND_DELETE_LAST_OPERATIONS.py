import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(str1, str2, k):
    if ((len(str1) + len(str2)) < k):
        return True
    commonLength = 0
    for i in range(0, min(len(str1), len(str2)), 1):
        if (str1[i] == str2[i]):
            commonLength += 1
        else:
            break
    if ((k - len(str1) - len(str2) + 2 * commonLength) % 2 == 0):
        return True
    return False


#TOFILL
if __name__ == '__main__':
    param = [
        ('ZNHGro', 'jAdbtDUYQu', 3,),
        ('382880806774', '65565', 10,),
        ('0', '00100010100', 2,),
        ('lxHTRFCTSQ', 'sViXYE', 89,),
        ('6399914758', '780990121', 9,),
        ('01100011100000', '0100', 0,),
        ('WkGqlob', 'NpQVdXzEtUZy', 6,),
        ('46974006151', '74438', 11,),
        ('1001001', '1000010', 15,),
        ('IJQ', 'nFOHAeYEAp', 42,)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CONVERTING_ONE_STRING_USING_APPEND_DELETE_LAST_OPERATIONS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
