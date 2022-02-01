if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (6,),
    (10,),
    (55,),
    (48,),
    (63,),
    (72,),
    (16,),
    (85,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
