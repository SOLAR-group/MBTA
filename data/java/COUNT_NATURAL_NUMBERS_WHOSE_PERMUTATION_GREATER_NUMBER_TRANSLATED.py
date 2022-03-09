import sys

def f_gold ( n ) :
    result = 0
    for i in range ( 1 , 9 ) :
        s = Stack ( )
        if i <= n :
            s.push ( i )
            result += 1
        while not s.empty ( ) :
            tp = s.top ( )
            s.pop ( )
            for j in range ( tp % 10 , 9 ) :
                x = tp * 10 + j
                if x <= n :
                    s.push ( x )
                    result += 1
    return result

if __name__ == '__main__':
    param = [
    (69,),
    (72,),
    (88,),
    (7,),
    (66,),
    (34,),
    (23,),
    (37,),
    (33,),
    (21,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("COUNT_NATURAL_NUMBERS_WHOSE_PERMUTATION_GREATER_NUMBER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
