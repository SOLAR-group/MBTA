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
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("DYNAMIC_PROGRAMMING_SET_37_BOOLEAN_PARENTHESIZATION_PROBLEM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
