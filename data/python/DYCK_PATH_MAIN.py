if __name__ == '__main__':
    param = [
    (72,),
    (90,),
    (61,),
    (28,),
    (70,),
    (13,),
    (7,),
    (98,),
    (99,),
    (67,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DYCK_PATH," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DYCK_PATH," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DYCK_PATH," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
