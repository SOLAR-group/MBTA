if __name__ == '__main__':
    param = [
    ('onWEchl',),
    ('2',),
    ('100',),
    ('GHbCZA',),
    ('50568798206105',),
    ('001011110001',),
    ('lljpYhznnyu',),
    ('54499921759984',),
    ('11101',),
    ('qvypgCYEjsyjwZ',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICALLY_MINIMUM_STRING_ROTATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
