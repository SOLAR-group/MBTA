if __name__ == '__main__':
    param = [
    (77,),
    (62,),
    (42,),
    (16,),
    (82,),
    (37,),
    (29,),
    (32,),
    (82,),
    (91,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("TAIL_RECURSION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
