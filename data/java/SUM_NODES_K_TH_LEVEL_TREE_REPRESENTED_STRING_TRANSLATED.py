import sys

def f_gold ( tree , k ) :
    level = - 1
    sum = 0
    n = len ( tree )
    for i in range ( n ) :
        if tree [ i ] == '(' :
            level += 1
        elif tree [ i ] == ')' :
            level -= 1
        else :
            if level == k :
                sum += ( tree [ i ] - '0' )
    return sum

if __name__ == '__main__':
    param = [
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',2,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',3,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',1,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',2,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',4,),
    ('(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))',100,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',3,),
    ('(0(5(6()())(4()(9()())))(7(1()())(3()())))',0,),
    ('0010',12,),
    ('kjtdgmy',97,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
