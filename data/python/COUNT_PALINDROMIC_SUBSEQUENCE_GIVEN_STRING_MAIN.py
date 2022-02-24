if __name__ == '__main__':
    param = [
    ('R',),
    ('2956350',),
    ('11100111110101',),
    ('TZTDLIIfAD',),
    ('98',),
    ('1100100001',),
    ('oKwGeatf',),
    ('19',),
    ('00010110100',),
    ('Cyq',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_PALINDROMIC_SUBSEQUENCE_GIVEN_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
