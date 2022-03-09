import sys

def f_gold ( n ) :
    if n < 3 :
        return n
    if n >= 3 and n < 10 :
        return n - 1
    po = 1
    while n / po > 9 :
        po = po * 10
    msd = n / po
    if msd != 3 :
        return f_gold ( msd ) * f_gold ( po - 1 ) + f_gold ( msd ) + f_gold ( n % po )
    else :
        return f_gold ( msd * po - 1 )

if __name__ == '__main__':
    param = [
    (85,),
    (86,),
    (3,),
    (35,),
    (59,),
    (38,),
    (33,),
    (15,),
    (75,),
    (74,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NUMBERS_THAT_DONT_CONTAIN_3," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NUMBERS_THAT_DONT_CONTAIN_3," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
