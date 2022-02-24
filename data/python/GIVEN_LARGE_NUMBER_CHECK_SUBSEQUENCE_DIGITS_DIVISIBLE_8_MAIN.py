if __name__ == '__main__':
    param = [
    ('1787075866',),
    ('8',),
    ('1110101110111',),
    ('6673177113',),
    ('7',),
    ('000001',),
    ('dbxMF',),
    ('71733',),
    ('01101101100',),
    ('',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("GIVEN_LARGE_NUMBER_CHECK_SUBSEQUENCE_DIGITS_DIVISIBLE_8," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("GIVEN_LARGE_NUMBER_CHECK_SUBSEQUENCE_DIGITS_DIVISIBLE_8," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
