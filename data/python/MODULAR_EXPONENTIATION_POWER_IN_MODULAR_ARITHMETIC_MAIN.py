if __name__ == '__main__':
    param = [
    (45,5,68,),
    (67,25,49,),
    (26,91,44,),
    (33,61,9,),
    (35,8,13,),
    (68,41,5,),
    (14,76,20,),
    (5,89,13,),
    (23,42,45,),
    (37,63,56,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MODULAR_EXPONENTIATION_POWER_IN_MODULAR_ARITHMETIC," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
