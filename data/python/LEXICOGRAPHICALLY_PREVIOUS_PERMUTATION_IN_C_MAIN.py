if __name__ == '__main__':
    param = [
    (['B', 'I', 'K', 'M', 'Q', 'Y', 'b', 'e', 'e', 't', 'x'],),
    (['7', '0', '2', '5', '1', '1', '4', '4', '8', '0', '2', '6', '4', '4', '0', '6', '7', '1', '7', '9', '8', '6', '1', '8', '3', '0', '6', '4', '4', '6', '3', '1', '3', '1', '9', '9', '4', '7', '4', '4', '3', '1', '4', '2', '9', '8', '1', '2', '4'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['o', 'S', 'R', 'm', 'i', 'S', 'z', 'z', 'W', 'X', 'A', 'A', 'M', 'L', 'V', 'Q', 'F', 'i', ' ', 'i', 'G', 'D', 'T', 'a', 'm', 'S', 'N', 's', 'j', 'P', 'E', 'n', 'a', 'Q', 'm'],),
    (['0', '0', '0', '0', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '6', '7', '7', '8', '8', '8', '9', '9', '9', '9', '9'],),
    (['0', '0', '1', '0', '1', '0', '0'],),
    ([' ', 'B', 'D', 'D', 'E', 'E', 'G', 'J', 'J', 'K', 'L', 'L', 'L', 'M', 'N', 'N', 'P', 'Q', 'V', 'W', 'W', 'X', 'Y', 'a', 'b', 'b', 'd', 'f', 'h', 'i', 'j', 'j', 'k', 'k', 'l', 'm', 'm', 'm', 'n', 'p', 'r', 's', 'u', 'v', 'v', 'w', 'x'],),
    (['5', '4', '4', '7', '5', '5', '1', '8', '6', '6', '9', '9', '6', '6', '8', '7', '4', '0', '7', '3', '6', '0', '9'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['q', 'a', 'U', 'N', 'V', 'v', 'U', 'R', 'x', 'i', 'S', 'N', 'V', 'V', 'j', 'r', 'e', 'N', 'M'],)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICALLY_PREVIOUS_PERMUTATION_IN_C," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICALLY_PREVIOUS_PERMUTATION_IN_C," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
