if __name__ == '__main__':
    param = [
    (71,46,),
    (90,65,),
    (28,84,),
    (41,23,),
    (32,58,),
    (39,82,),
    (33,58,),
    (89,32,),
    (50,51,),
    (92,77,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_ROTATIONS_UNLOCK_CIRCULAR_LOCK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
