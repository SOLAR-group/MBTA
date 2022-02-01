if __name__ == '__main__':
    param = [
    (75,),
    (76,),
    (55,),
    (14,),
    (43,),
    (10,),
    (16,),
    (30,),
    (44,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LEONARDO_NUMBER_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LEONARDO_NUMBER_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LEONARDO_NUMBER_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
