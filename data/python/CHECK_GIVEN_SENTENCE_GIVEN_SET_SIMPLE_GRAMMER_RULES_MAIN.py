if __name__ == '__main__':
    param = ["I love cinema.", "The vertex is S.",
            "I am single.", "My name is KG.",
            "I lovE cinema.", "GeeksQuiz. is a quiz site.",
            "I love Geeksquiz and Geeksforgeeks.",
            "  You are my friend.", "I love cinema", "Hello world !"]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(parameters_set) == f_gold(parameters_set):
                print("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("CHECK_GIVEN_SENTENCE_GIVEN_SET_SIMPLE_GRAMMER_RULES," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
