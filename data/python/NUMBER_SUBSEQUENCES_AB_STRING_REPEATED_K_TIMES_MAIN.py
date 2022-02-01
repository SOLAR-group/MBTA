if __name__ == '__main__':
    param = [
   ('abbc',96,),
('abahk',7,),
('hugbabab',5,),
('abadbc',60,),
('nkg9',8,),
('jh7dab',41,),
('abd',87,),
('aabb8yk',4,),
('1111',18,),
('PFXAhr',8,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("NUMBER_SUBSEQUENCES_AB_STRING_REPEATED_K_TIMES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
