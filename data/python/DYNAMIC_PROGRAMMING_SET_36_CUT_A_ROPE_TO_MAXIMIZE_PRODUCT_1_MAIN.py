if __name__ == '__main__':
    param = [
        (62,),
        (53,),
        (8,),
        (6,),
        (35,),
        (35,),
        (46,),
        (74,),
        (69,),
        (3,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
