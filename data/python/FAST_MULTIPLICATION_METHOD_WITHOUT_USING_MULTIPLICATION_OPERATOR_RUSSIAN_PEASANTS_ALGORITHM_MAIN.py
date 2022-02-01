if __name__ == '__main__':
    param = [
    (4,33,),
    (36,67,),
    (65,52,),
    (55,37,),
    (35,76,),
    (69,98,),
    (84,62,),
    (5,80,),
    (15,36,),
    (67,84,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FAST_MULTIPLICATION_METHOD_WITHOUT_USING_MULTIPLICATION_OPERATOR_RUSSIAN_PEASANTS_ALGORITHM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
