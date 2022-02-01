if __name__ == '__main__':
    param = [
    (76,43,),
    (77,91,),
    (9,42,),
    (59,67,),
    (8,52,),
    (97,8,),
    (78,24,),
    (41,88,),
    (72,61,),
    (71,28,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FINDING_POWER_PRIME_NUMBER_P_N_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
