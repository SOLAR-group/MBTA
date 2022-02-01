if __name__ == '__main__':
    param = [
    (97,),
    (97,),
    (32,),
    (40,),
    (18,),
    (14,),
    (90,),
    (39,),
    (1,),
    (57,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TRIANGULAR_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TRIANGULAR_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TRIANGULAR_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
