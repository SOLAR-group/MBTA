if __name__ == '__main__':
    param = [
    (99,),
    (33,),
    (50,),
    (17,),
    (18,),
    (69,),
    (23,),
    (18,),
    (94,),
    (16,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HARDY_RAMANUJAN_THEOREM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HARDY_RAMANUJAN_THEOREM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HARDY_RAMANUJAN_THEOREM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
