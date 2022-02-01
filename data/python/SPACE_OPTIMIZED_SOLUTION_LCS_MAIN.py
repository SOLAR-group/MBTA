if __name__ == '__main__':
    param = [
    ('YNpjSv','qtUkJn',),
    ('736519','07592',),
    ('11010000100010','0',),
    ('v ','qGBQT',),
    ('8311172','157219329531',),
    ('100011101011','1000001111',),
    ('u','YzkubTqLhP',),
    ('3943042','3859',),
    ('101','00010000101010',),
    ('MpbfF OsizevaM','WgsFGaQwtp',)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("SPACE_OPTIMIZED_SOLUTION_LCS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("SPACE_OPTIMIZED_SOLUTION_LCS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("SPACE_OPTIMIZED_SOLUTION_LCS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
