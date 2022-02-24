if __name__ == '__main__':
    param = [
    (15,),
    (7,),
    (16,),
    (67,),
    (71,),
    (16,),
    (77,),
    (27,),
    (37,),
    (73,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("C_PROGRAM_FACTORIAL_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
