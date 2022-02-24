if __name__ == '__main__':
    param = [
    ('IVQPwMhUYLDTcO',),
    ('2568689919714',),
    ('0110011',),
    ('CSUPHnJs',),
    ('67978022339633',),
    ('0110011101',),
    ('RgR',),
    ('62249378',),
    ('000110110',),
    ('IRcBQAUdiyKrz',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_12_LONGEST_PALINDROMIC_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_12_LONGEST_PALINDROMIC_SUBSEQUENCE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
