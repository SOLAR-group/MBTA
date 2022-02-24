if __name__ == '__main__':
    param = [
    ('SgUmIrEAB',),
    ('304',),
    ('0010',),
    ('VGC BeErLvQ',),
    ('0872',),
    ('00110001',),
    ('Lsqwm',),
    ('308998',),
    ('1000011',),
    ('XCEOs',)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FIND_SECOND_FREQUENT_CHARACTER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
