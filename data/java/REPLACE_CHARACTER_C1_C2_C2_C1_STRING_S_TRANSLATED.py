import sys

def f_gold ( s , c1 , c2 ) :
    l = len ( s )
    arr = s [ : l ]
    for i in range ( l ) :
        if arr [ i ] == c1 :
            arr [ i ] = c2
        elif arr [ i ] == c2 :
            arr [ i ] = c1
    return str ( arr )

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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("REPLACE_CHARACTER_C1_C2_C2_C1_STRING_S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
