if __name__ == '__main__':
    param = [
        (67,),
        (48,),
        (59,),
        (22,),
        (14,),
        (66,),
        (1,),
        (75,),
        (58,),
        (78,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
