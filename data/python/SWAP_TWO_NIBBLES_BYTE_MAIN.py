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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SWAP_TWO_NIBBLES_BYTE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
