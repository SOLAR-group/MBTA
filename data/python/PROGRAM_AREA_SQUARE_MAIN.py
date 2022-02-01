if __name__ == '__main__':
    param = [
    (50,),
    (64,),
    (92,),
    (23,),
    (38,),
    (55,),
    (67,),
    (56,),
    (60,),
    (90,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_AREA_SQUARE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
