if __name__ == '__main__':
    param = [
    ('K',),
    ('850076',),
    ('00111',),
    ('X',),
    ('1',),
    ('10010001100',),
    (' pgPeLz',),
    ('53212456821275',),
    ('101',),
    ('V',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("REMAINDER_7_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("REMAINDER_7_LARGE_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
