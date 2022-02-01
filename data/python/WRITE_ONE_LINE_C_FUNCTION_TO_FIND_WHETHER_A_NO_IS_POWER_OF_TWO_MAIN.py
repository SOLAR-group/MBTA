if __name__ == '__main__':
    param = [
        (1,),
        (2,),
        (8,),
        (1024,),
        (24,),
        (7,),
        (46,),
        (61,),
        (73,),
        (66,)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                n_success += 1
        print("#Results: %i, %i" % (n_success, len(param)))
