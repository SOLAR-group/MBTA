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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SPACE_OPTIMIZED_SOLUTION_LCS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SPACE_OPTIMIZED_SOLUTION_LCS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
