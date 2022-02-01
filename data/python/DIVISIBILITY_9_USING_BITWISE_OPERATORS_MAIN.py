if __name__ == '__main__':
    param = [
    (96,),
    (85,),
    (54,),
    (14,),
    (47,),
    (11,),
    (49,),
    (99,),
    (28,),
    (82,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DIVISIBILITY_9_USING_BITWISE_OPERATORS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DIVISIBILITY_9_USING_BITWISE_OPERATORS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DIVISIBILITY_9_USING_BITWISE_OPERATORS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
