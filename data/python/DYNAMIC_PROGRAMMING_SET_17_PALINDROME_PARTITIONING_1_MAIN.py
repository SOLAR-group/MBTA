if __name__ == '__main__':
    param = [
    ('YYGWgYrovdsh',),
    ('56109778',),
    ('101',),
    ('RxM',),
    ('187546405',),
    ('0110010',),
    ('wVODAmgvI',),
    ('56719',),
    ('10100011001100',),
    ('Wtpai',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_17_PALINDROME_PARTITIONING_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
