import sys

def f_gold ( s ) :
    stack = [ ]
    lines = s.split ( '\n' )
    for ch in lines :
        if ch == ')' :
            top = stack.pop ( )
            stack.append ( top )
            elementsInside = 0
            while top != '(' :
                elementsInside += 1
                top = stack.pop ( )
                stack.append ( top )
            if elementsInside < 1 :
                return True
        else :
            stack.append ( ch )
    return False

if __name__ == '__main__':
    param = [
    ("((a+b)+((c+d)))",),
    ("(((a+(b)))+(c+d))",),
    ("(((a+(b))+c+d))",),
    ("((a+b)+(c+d))",),
    ("(8582007)",),
    ("((a+(b))+(c+d))",),
    ("(PylsShEdKAE)",),
    ('886980680541',),
    ('001',),
    ('jsVmFeOq',)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_EXPRESSION_DUPLICATE_PARENTHESIS_NOT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
