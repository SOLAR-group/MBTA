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
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SWAP_ALL_ODD_AND_EVEN_BITS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
