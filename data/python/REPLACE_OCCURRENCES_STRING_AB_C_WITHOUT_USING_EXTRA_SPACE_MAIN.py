if __name__ == '__main__':
    param = [
        (['A', 'B', 'E', 'H', 'I', 'I', 'I', 'J', 'K', 'U', 'a',
          'c', 'd', 'f', 'i', 'i', 'k', 'k', 'x', 'y', 'z', 'z'],),
        (['1', '3', '7', '6', '1', '3', '8', '8', '7', '7', '3', '7', '5', '5', '4', '1', '3', '5',
          '3', '0', '7', '5', '2', '9', '1', '2', '9', '4', '4', '4', '5', '2', '6', '7', '0'],),
        (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1',
          '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
        (['A', 'y', 't', 's', 'A', 'B', 'r', 'L', 'm', 'B', 'Z', 'r', 'T',
          'n', 'l', 'f', 'C', 'e', 'f', 'h', 't', ' ', 'u', 'M', 'n', 't'],),
        (['0', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4',
          '4', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '7', '7', '7', '8', '8', '8', '8', '8', '9', '9', '9'],),
        (['0', '1', '1', '1', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '1', '0', '0', '1',
          '1', '0', '0', '0', '0', '0', '1', '0', '1', '1', '1', '0', '0', '1', '0', '1', '0', '1', '1', '0', '1', '0', '0'],),
        ([' ', 'A', 'A', 'B', 'C', 'C', 'E', 'F', 'H', 'H', 'H', 'I', 'I', 'K', 'K', 'L', 'N', 'Q', 'S', 'S', 'V',
          'W', 'X', 'X', 'Y', 'Z', 'c', 'f', 'f', 'g', 'i', 'j', 'j', 'm', 'q', 'q', 'r', 'v', 'w', 'x', 'y'],),
        (['0', '1', '1'],),
        (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
          '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
        (['b', 't', 'X', 'F'],)
    ]
    filled_function_param = [
        (['A', 'B', 'E', 'H', 'I', 'I', 'I', 'J', 'K', 'U', 'a',
          'c', 'd', 'f', 'i', 'i', 'k', 'k', 'x', 'y', 'z', 'z'],),
        (['1', '3', '7', '6', '1', '3', '8', '8', '7', '7', '3', '7', '5', '5', '4', '1', '3', '5',
          '3', '0', '7', '5', '2', '9', '1', '2', '9', '4', '4', '4', '5', '2', '6', '7', '0'],),
        (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1',
          '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
        (['A', 'y', 't', 's', 'A', 'B', 'r', 'L', 'm', 'B', 'Z', 'r', 'T',
          'n', 'l', 'f', 'C', 'e', 'f', 'h', 't', ' ', 'u', 'M', 'n', 't'],),
        (['0', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4',
          '4', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '7', '7', '7', '8', '8', '8', '8', '8', '9', '9', '9'],),
        (['0', '1', '1', '1', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', '1', '0', '0', '1',
          '1', '0', '0', '0', '0', '0', '1', '0', '1', '1', '1', '0', '0', '1', '0', '1', '0', '1', '1', '0', '1', '0', '0'],),
        ([' ', 'A', 'A', 'B', 'C', 'C', 'E', 'F', 'H', 'H', 'H', 'I', 'I', 'K', 'K', 'L', 'N', 'Q', 'S', 'S', 'V',
          'W', 'X', 'X', 'Y', 'Z', 'c', 'f', 'f', 'g', 'i', 'j', 'j', 'm', 'q', 'q', 'r', 'v', 'w', 'x', 'y'],),
        (['0', '1', '1'],),
        (['0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
          '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'],),
        (['b', 't', 'X', 'F'],)
    ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            f_filled(*(filled_function_param[i]))
            f_gold(*parameters_set)
            if parameters_set == filled_function_param[i]:
                print("REPLACE_OCCURRENCES_STRING_AB_C_WITHOUT_USING_EXTRA_SPACE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("REPLACE_OCCURRENCES_STRING_AB_C_WITHOUT_USING_EXTRA_SPACE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("REPLACE_OCCURRENCES_STRING_AB_C_WITHOUT_USING_EXTRA_SPACE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
