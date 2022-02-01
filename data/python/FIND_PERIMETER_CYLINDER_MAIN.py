if __name__ == '__main__':
    param = [
    (70,78,),
    (97,46,),
    (49,26,),
    (56,61,),
    (87,79,),
    (64,21,),
    (75,93,),
    (90,16,),
    (55,16,),
    (73,29,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_PERIMETER_CYLINDER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_PERIMETER_CYLINDER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_PERIMETER_CYLINDER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
