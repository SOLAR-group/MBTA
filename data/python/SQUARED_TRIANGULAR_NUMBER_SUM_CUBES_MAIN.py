if __name__ == '__main__':
    param = [
    (15,),
    (36,),
    (39,),
    (43,),
    (75,),
    (49,),
    (56,),
    (14,),
    (62,),
    (97,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SQUARED_TRIANGULAR_NUMBER_SUM_CUBES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
