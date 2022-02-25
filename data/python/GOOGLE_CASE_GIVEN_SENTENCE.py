import sys
# Copyright (c) 2019-present, Facebook, Inc.
# All rights reserved.
#
# This source code is licensed under the license found in the
# LICENSE file in the root directory of this source tree.
#
def f_gold(s):
    n = len(s)
    s1 = ""
    s1 = s1 + s[0].lower()
    i = 1
    while i < n:
        if (s[i] == ' ' and i <= n):
            s1 = s1 + " " + (s[i + 1]).lower()
            i = i + 1
        else:
            s1 = s1 + (s[i]).upper()
        i = i + 1
    return s1


#TOFILL
if __name__ == '__main__':
    param = [
        ('TEYndweqZA',),
        ('01865',),
        ('11001100',),
        ('CzwznJmQet',),
        ('318305446',),
        ('0000001111110',),
        ('yzT',),
        ('38630230',),
        ('01101',),
        ('zoizI',)
    ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("GOOGLE_CASE_GIVEN_SENTENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
