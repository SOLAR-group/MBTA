if __name__ == '__main__':
    param = [
    (66,4,),
    (82,66,),
    (12,38,),
    (55,33,),
    (34,26,),
    (22,23,),
    (13,98,),
    (57,84,),
    (76,94,),
    (76,95,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("WRITE_YOU_OWN_POWER_WITHOUT_USING_MULTIPLICATION_AND_DIVISION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")