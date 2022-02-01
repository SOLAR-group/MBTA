if __name__ == '__main__':
    param = [
    ("TTFT", "|&^",4,),
    ("TFT", "^&",3,),
    ("TFF", "^|",3,),
    ("TTFT", "|||",4,),
    ("TTFT", "&&&",4,),
    ("TTFT", "&&^",4,),
    ("TTFT", "^&|",4,),
    ("TTFT", "^^^",4,),
    ("TTFT", "^||",4,),
    ("TTFT", "|^|",4,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
