if __name__ == '__main__':
    param = [
    (57,),
    (99,),
    (66,),
    (97,),
    (95,),
    (42,),
    (95,),
    (89,),
    (3,),
    (84,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
