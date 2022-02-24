if __name__ == '__main__':
    param = [
    ('qnQxjoRx',),
    ('27473733400077',),
    ('000010111111',),
    ('TNVwgrWSLu',),
    ('9537',),
    ('1100',),
    ('lYcoiQfzN',),
    ('52',),
    ('00100001100',),
    ('Rkxe',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_REPEATED_SUBSEQUENCE_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_REPEATED_SUBSEQUENCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
