if __name__ == '__main__':
    param = [
    ([10,74,5],0,2,1,),
    ([-90,72,36,96,42,0,-66,5],0,7,96,),
    ([0,5],0,1,-1,),
    ([99,70,67,5],0,3,3,),
    ([-98,-98,-26,-26,-24,-18,-16,80,5],0,8,80,),
    ([1,1,1,1,0,1,5],0,6,1,),
    ([1,5,12,12,17,17,12,95,96,98,5],0,0,12,),
    ([50,-70,-30,-54,6,-10,70,84,5],0,8,27,),
    ([0,1,5],0,2,14,),
    ([59,21,28,3,14,5],0,5,28,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("RECURSIVE_C_PROGRAM_LINEARLY_SEARCH_ELEMENT_GIVEN_ARRAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
