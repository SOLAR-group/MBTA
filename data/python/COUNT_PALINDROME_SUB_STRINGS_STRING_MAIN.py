if __name__ == '__main__':
    param = [
    (['E', 'E', 'J', 'P', 'T', 'U', 'X', 'Y', 'Z', 'e', 'f', 'h', 'l', 'm', 'n', 'o', 'z'],11,),
    (['8', '7', '3', '4', '9', '5', '3', '1', '4', '0', '6', '8', '2', '5', '8', '3', '5', '2', '8', '6', '6', '3', '5', '7', '5', '5', '3', '7'],27,),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],23,),
    (['f', 'E', 'e', 'z', 'B', 'o', 'i', 'v', 'K', 'u', 'P', 'C', 'z', 'f', 'k', 'J', 't', 'R', 't', 'A', 'f', 'G', 'D', 'X', 'H', 'e', 'p', 'l', 'l', 'k', 'Z', 'Y', 'u', 'g', 'H', 'C', 'f', 'J', 'H', 'W'],27,),
    (['0', '0', '0', '1', '1', '1', '1', '1', '1', '2', '2', '2', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '6', '6', '7', '7', '9', '9', '9', '9', '9', '9'],35,),
    (['1', '0', '1', '1', '0', '0', '1', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0', '1', '1', '1', '1', '1', '0', '1', '1', '0', '1', '0', '1', '1', '0', '0', '1', '0', '1', '0', '0', '0', '0', '0', '1', '1', '0', '1', '0', '1'],43,),
    (['C', 'C', 'D', 'F', 'L', 'M', 'P', 'X', 'a', 'f', 'i', 'j', 'w'],9,),
    (['7', '9', '0', '2', '8', '0', '7', '5', '9', '4', '5', '4', '8', '1', '9', '5', '3', '2', '4', '1', '2'],16,),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],32,),
    (['m', 'X', 'N', 'M'],3,)
        ]
    n_success = 0
    print("class,mutant,test_index,result\n")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_PALINDROME_SUB_STRINGS_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_PALINDROME_SUB_STRINGS_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
