if __name__ == '__main__':
    param = [
    (81,39,),
    (19,94,),
    (49,37,),
    (40,88,),
    (36,28,),
    (11,46,),
    (82,94,),
    (80,37,),
    (82,75,),
    (56,9,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("GCD_FACTORIALS_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("GCD_FACTORIALS_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("GCD_FACTORIALS_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
