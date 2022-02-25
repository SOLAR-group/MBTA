if __name__ == '__main__':
    param = [
    ('LsvbpcviVPwq',15,),
    ('35225904',2,),
    ('010010',36,),
    ('QnYd',44,),
    ('2571694',11,),
    ('101101011010',94,),
    ('jb',22,),
    ('928874',83,),
    ('11',93,),
    ('FbvbkMb',37,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("CAESAR_CIPHER," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("CAESAR_CIPHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
