if __name__ == '__main__':
    param = [
    (14,),
    (78,),
    (45,),
    (66,),
    (18,),
    (32,),
    (60,),
    (16,),
    (99,),
    (65,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("AREA_SQUARE_CIRCUMSCRIBED_CIRCLE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("AREA_SQUARE_CIRCUMSCRIBED_CIRCLE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("AREA_SQUARE_CIRCUMSCRIBED_CIRCLE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
