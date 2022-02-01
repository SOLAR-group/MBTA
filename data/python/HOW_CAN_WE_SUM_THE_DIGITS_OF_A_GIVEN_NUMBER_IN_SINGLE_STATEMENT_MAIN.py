if __name__ == '__main__':
    param = [
        (57,),
        (21,),
        (11,),
        (64,),
        (88,),
        (62,),
        (17,),
        (49,),
        (22,),
        (19,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
