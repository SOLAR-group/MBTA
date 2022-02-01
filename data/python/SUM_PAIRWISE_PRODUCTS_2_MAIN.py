if __name__ == '__main__':
    param = [
    (57,),
    (18,),
    (97,),
    (9,),
    (42,),
    (67,),
    (71,),
    (66,),
    (69,),
    (18,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SUM_PAIRWISE_PRODUCTS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
