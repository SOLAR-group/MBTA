if __name__ == '__main__':
    param = [
        (50, 60,),
        (52, 45,),
        (42, 17,),
        (2, 68,),
        (37, 43,),
        (48, 46,),
        (31, 4,),
        (9, 64,),
        (78, 14,),
        (64, 80,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
