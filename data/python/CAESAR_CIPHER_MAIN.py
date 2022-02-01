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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("CAESAR_CIPHER," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CAESAR_CIPHER," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CAESAR_CIPHER," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
