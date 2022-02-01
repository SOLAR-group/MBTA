if __name__ == '__main__':
    param = [
    (54,),
    (71,),
    (64,),
    (71,),
    (96,),
    (43,),
    (70,),
    (94,),
    (95,),
    (69,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("ZECKENDORFS_THEOREM_NON_NEIGHBOURING_FIBONACCI_REPRESENTATION," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
