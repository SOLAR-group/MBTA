if __name__ == '__main__':
    param = [
    ('pR',),
    ('9518',),
    ('1',),
    ('nNMCIXUCpRMmvO',),
    ('3170487',),
    ('0100101010',),
    ('Z rONcUqWb',),
    ('00419297',),
    ('00',),
    ('r',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CALCULATE_MAXIMUM_VALUE_USING_SIGN_TWO_NUMBERS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
