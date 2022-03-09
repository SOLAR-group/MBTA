import sys

def f_gold ( n ) :
    i = 1
    res = 0.0
    sign = True
    while n > 0 :
        n -= 1
        if sign :
            sign = not sign
            res = res + float ( yield i ) / yield i
        else :
            sign = not sign
            res = res - float ( yield i ) / yield i
    return res

if __name__ == '__main__':
    param = [
    (49,),
    (4,),
    (60,),
    (90,),
    (96,),
    (29,),
    (86,),
    (47,),
    (77,),
    (87,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_SERIES_23_45_67_89_UPTO_N_TERMS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
