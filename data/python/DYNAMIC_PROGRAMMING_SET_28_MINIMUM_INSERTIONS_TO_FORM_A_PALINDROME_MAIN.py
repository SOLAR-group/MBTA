if __name__ == '__main__':
    param = [
    (['F', 'F', 'J', 'K', 'K', 'L', 'P', 'S', 'T', 'V', 'W', 'Y', 'b', 'd', 'j', 'l', 't', 'u', 'x', 'y'],11,11,),
    (['0', '1', '8', '8', '8', '4', '4', '3', '9', '6', '5', '2', '8', '2', '0', '2', '6', '0', '7', '7', '3', '2', '4', '5', '9', '7', '2', '4', '1', '8', '7', '9', '8', '0', '8', '5', '4', '2', '3'],19,22,),
    (['1'],0,0,),
    (['g', 'y', 'r', 'M', 'v', 'z', ' ', 'k', 'S', 'P', 'x', 'p', 'E', 'z', 'T', 'K', 'k', 'B', 's', 'P', 'p', 'e', 'G', 't', 'r', 'M', 'p', ' ', 'H', 'a'],24,27,),
    (['0', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '3', '3', '3', '3', '3', '4', '4', '4', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '7', '8', '8', '8', '9', '9'],33,34,),
    (['1', '1', '0', '1', '0', '1', '0', '1', '0', '1', '1', '1', '1', '1', '1', '0'],13,8,),
    ([' ', ' ', ' ', 'B', 'C', 'C', 'D', 'I', 'K', 'O', 'P', 'R', 'T', 'V', 'W', 'a', 'b', 'd', 'j', 'y'],16,14,),
    (['5', '0', '8', '6', '9', '3', '0', '3', '2', '0', '6', '2', '3', '7', '8', '9', '2', '0', '1', '9', '4', '1', '3', '1', '9', '2', '3', '4', '1', '2', '3', '8', '1'],31,25,),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],37,35,),
    (['X', 'B', 'E', 'v', 'K', 't', 'k', 'K', 'Q', 's', 'V', 'N', 'l', 'k', 'T', 'N', 'J', 'z', 'f', 'p', 'J', 'g', 'S', 'P', 'M', 'b', 'H', 'L', 'v', 'E', 'A', 'n', 'D', 'U', 'c', 's', 'M', 'Q', 'P', 'g', 'g', ' '],26,27,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_28_MINIMUM_INSERTIONS_TO_FORM_A_PALINDROME," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
