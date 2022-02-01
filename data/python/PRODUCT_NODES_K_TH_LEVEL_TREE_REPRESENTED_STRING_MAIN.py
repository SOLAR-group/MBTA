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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("PRODUCT_NODES_K_TH_LEVEL_TREE_REPRESENTED_STRING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
