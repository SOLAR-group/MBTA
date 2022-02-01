if __name__ == '__main__':
    param = [
        (87,),
        (69,),
        (15,),
        (11,),
        (11,),
        (15,),
        (47,),
        (65,),
        (50,),
        (58,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
