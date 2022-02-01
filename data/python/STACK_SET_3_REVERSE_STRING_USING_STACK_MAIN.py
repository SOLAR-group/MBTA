if __name__ == '__main__':
    param = [
    (['A', 'C', 'E', 'M', 'R', 'd', 'g', 'o'],),
    (['5', '7', '5', '2', '0', '8', '2', '4', '1', '5', '8', '0', '8', '8'],),
    (['0', '0', '0', '1', '1', '1', '1', '1', '1'],),
    (['p', 'M', 'h', 'O', 'b', 'I', 'P', 'X', 'V', 'z', 'Q', 'i', 'k', 'S', 'Z', 'j', 'O', 'q', 'f', 'A', 'Q', 'I', 'X', 'R', 'x', 's', 'a', 'Q', 'N', 'r', 'l', 'M', 'D', 'O', 'S', 'k', 'x', 'l', 'C', 'P'],),
    (['5'],),
    (['0', '0', '0', '0'],),
    (['L', 'R', 'W', 'g', 'l', 'w'],),
    (['0', '7', '9', '9', '9', '9', '9', '2', '9', '0', '3', '7', '8', '0', '2', '0', '9', '8', '7', '8', '0', '9', '1'],),
    (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
    (['J', 'y', 'F', 'z', 'V', 'E', 'm', 'G', 'x', 'Y', 'G', 'F', 'J', 's', 'm', 'e', 'd', 'S', 'T', 'H', 'L', 'V', 'j', 't', 'B', 'u'],)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("STACK_SET_3_REVERSE_STRING_USING_STACK," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("STACK_SET_3_REVERSE_STRING_USING_STACK," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("STACK_SET_3_REVERSE_STRING_USING_STACK," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
