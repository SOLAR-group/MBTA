import sys

def f_gold ( num ) :
    if num < 0 :
        return False
    c = ( - 2 * num )
    b , a = 1 , 1
    d = ( b ** 2 ) - ( 4 * a ** 2 )
    if d < 0 :
        return False
    root1 = ( - b + float ( math.sqrt ( d ) ) ) / ( 2 * a )
    root2 = ( - b - float ( math.sqrt ( d ) ) ) / ( 2 * a )
    if root1 and math.floor ( root1 ) == root1 :
        return True
    if root2 and math.floor ( root2 ) == root2 :
        return True
    return False

if __name__ == '__main__':
    param = [
    (1,),
    (3,),
    (6,),
    (10,),
    (55,),
    (48,),
    (63,),
    (72,),
    (16,),
    (85,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("TRIANGULAR_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
