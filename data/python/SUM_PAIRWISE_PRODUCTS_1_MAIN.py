if __name__ == '__main__':
    param = [
    (41,),
    (50,),
    (67,),
    (18,),
    (60,),
    (6,),
    (27,),
    (46,),
    (50,),
    (20,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_PAIRWISE_PRODUCTS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_PAIRWISE_PRODUCTS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_PAIRWISE_PRODUCTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
