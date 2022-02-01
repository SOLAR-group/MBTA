if __name__ == '__main__':
    param = [
    (55,),
    (36,),
    (69,),
    (92,),
    (73,),
    (16,),
    (88,),
    (19,),
    (66,),
    (68,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_STRINGS_CAN_FORMED_USING_B_C_GIVEN_CONSTRAINTS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
