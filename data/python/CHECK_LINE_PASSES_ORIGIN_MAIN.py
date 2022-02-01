if __name__ == '__main__':
    param = [
    (1,28,2,56,),
    (10,0,20,0,),
    (0,1,0,17,),
    (1,1,10,10,),
    (82,86,19,4,),
    (78,86,11,6,),
    (13,46,33,33,),
    (18,29,95,12,),
    (42,35,25,36,),
    (29,17,45,35,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CHECK_LINE_PASSES_ORIGIN," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_LINE_PASSES_ORIGIN," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_LINE_PASSES_ORIGIN," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
