if __name__ == '__main__':
    param = [
    ('ncYltuhSxEfG',),
    ('26615541616459',),
    ('0101',),
    ('hK',),
    ('422162103899',),
    ('0010',),
    ('zfcSh',),
    ('92',),
    ('0',),
    ('v',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FORM_SMALLEST_NUMBER_USING_ONE_SWAP_OPERATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
