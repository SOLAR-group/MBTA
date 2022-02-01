if __name__ == '__main__':
    param = [
    ("((a+b)+((c+d)))",),
    ("(((a+(b)))+(c+d))",),
    ("(((a+(b))+c+d))",),
    ("((a+b)+(c+d))",),
    ("(8582007)",),
    ("((a+(b))+(c+d))",),
    ("(PylsShEdKAE)",),
    ('886980680541',),
    ('001',),
    ('jsVmFeOq',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
