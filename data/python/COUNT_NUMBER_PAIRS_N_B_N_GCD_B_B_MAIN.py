if __name__ == '__main__':
    param = [
        (17,),
        (72,),
        (43,),
        (55,),
        (62,),
        (22,),
        (17,),
        (68,),
        (20,),
        (29,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
