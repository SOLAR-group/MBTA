import sys

def f_gold ( str ) :
    mx = ""
    for i in range ( len ( str ) ) :
        if mx <= str [ i ] :
            mx = str [ i ]
    return mx

if __name__ == '__main__':
    param = [
    ('HCoAefoaan',),
    ('80336005',),
    ('01111111110',),
    ('qIH',),
    ('4210598472796',),
    ('10101',),
    ('imqmKdatcgXjs',),
    ('950509666021',),
    ('10111101101',),
    ('wasqgYFvz',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LEXICOGRAPHICAL_MAXIMUM_SUBSTRING_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
