if __name__ == '__main__':
    param = [
    (91,29,),
    (99,55,),
    (11,56,),
    (23,56,),
    (12,97,),
    (1,64,),
    (18,5,),
    (14,37,),
    (13,55,),
    (36,99,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_DAYS_TANK_WILL_BECOME_EMPTY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
