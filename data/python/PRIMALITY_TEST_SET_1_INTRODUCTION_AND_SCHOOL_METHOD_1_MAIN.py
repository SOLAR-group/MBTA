if __name__ == '__main__':
    param = [
        (15,),
        (90,),
        (38,),
        (65,),
        (91,),
        (16,),
        (48,),
        (74,),
        (14,),
        (47,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
