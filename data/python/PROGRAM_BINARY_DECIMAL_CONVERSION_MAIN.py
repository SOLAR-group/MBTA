if __name__ == '__main__':
    param = [
    (70,),
    (95,),
    (41,),
    (97,),
    (8,),
    (16,),
    (41,),
    (57,),
    (81,),
    (78,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("PROGRAM_BINARY_DECIMAL_CONVERSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
