if __name__ == '__main__':
    param = [
    ('MgTOyHo NT',),
    ('033675175',),
    ('011001',),
    ('XLlccG',),
    ('8223900094410',),
    ('000',),
    ('aupp',),
    ('90202721499',),
    ('110000100011',),
    ('MhYHsMQeLhG',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PROGRAM_CHECK_INPUT_INTEGER_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PROGRAM_CHECK_INPUT_INTEGER_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PROGRAM_CHECK_INPUT_INTEGER_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
