if __name__ == '__main__':
    param = [
    (21,),
    (32,),
    (16,),
    (38,),
    (9,),
    (3,),
    (5,),
    (46,),
    (45,),
    (87,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_PAIRWISE_PRODUCTS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
