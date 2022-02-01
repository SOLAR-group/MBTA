if __name__ == '__main__':
    param = [
        (38, 34,),
        (39, 29,),
        (24, 99,),
        (90, 23,),
        (44, 2,),
        (49, 70,),
        (58, 84,),
        (97, 34,),
        (99, 72,),
        (19, 67,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
