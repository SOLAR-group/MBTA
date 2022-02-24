if __name__ == '__main__':
    param = [
    (71,78,),
    (85,75,),
    (4,35,),
    (20,99,),
    (71,29,),
    (72,88,),
    (36,54,),
    (95,52,),
    (83,33,),
    (72,13,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("EULERS_CRITERION_CHECK_IF_SQUARE_ROOT_UNDER_MODULO_P_EXISTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
