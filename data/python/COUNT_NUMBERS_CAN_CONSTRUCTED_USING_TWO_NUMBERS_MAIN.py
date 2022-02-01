if __name__ == '__main__':
    param = [
    (23,16,16,),
    (56,95,6,),
    (30,63,1,),
    (51,89,46,),
    (21,99,38,),
    (69,63,50,),
    (12,69,73,),
    (44,52,9,),
    (99,65,10,),
    (46,58,37,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBERS_CAN_CONSTRUCTED_USING_TWO_NUMBERS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
