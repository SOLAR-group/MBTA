if __name__ == '__main__':
    param = [
    ('IZTSMw j','W','k',),
    ('7288334','6','9',),
    ('010110000','1','1',),
    ('b gJX','t','P',),
    ('734','4','4',),
    ('1','1','1',),
    ('xCaUKdhA','X','S',),
    ('4370992644981','5','6',),
    ('01010','0','1',),
    ('ZNIFGshaWA','Q','x',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")