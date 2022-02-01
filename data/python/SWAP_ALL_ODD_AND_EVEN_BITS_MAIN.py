if __name__ == '__main__':
    param = [
    (99,),
    (94,),
    (11,),
    (3,),
    (77,),
    (57,),
    (54,),
    (66,),
    (98,),
    (36,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
