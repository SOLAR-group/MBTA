if __name__ == '__main__':
    param = [
    (18,),
    (92,),
    (87,),
    (50,),
    (56,),
    (88,),
    (3,),
    (16,),
    (45,),
    (58,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_DECIMAL_BINARY_CONVERSION_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
