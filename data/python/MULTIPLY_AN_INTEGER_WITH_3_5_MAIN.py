if __name__ == '__main__':
    param = [
    (58,),
    (16,),
    (82,),
    (33,),
    (88,),
    (51,),
    (81,),
    (38,),
    (79,),
    (89,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MULTIPLY_AN_INTEGER_WITH_3_5," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
