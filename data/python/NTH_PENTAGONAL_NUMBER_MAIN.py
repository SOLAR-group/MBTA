if __name__ == '__main__':
    param = [
    (96,),
    (93,),
    (15,),
    (8,),
    (21,),
    (14,),
    (11,),
    (79,),
    (24,),
    (94,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NTH_PENTAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NTH_PENTAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NTH_PENTAGONAL_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
