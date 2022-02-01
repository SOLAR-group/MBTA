if __name__ == '__main__':
    param = [
        (55,),
        (35,),
        (24,),
        (75,),
        (5,),
        (7,),
        (50,),
        (28,),
        (67,),
        (59,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
