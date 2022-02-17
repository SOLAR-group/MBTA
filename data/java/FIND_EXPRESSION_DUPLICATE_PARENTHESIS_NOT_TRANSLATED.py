====================
def pycollect_find_expression_duplicate_parenthesis_not ( s ) :
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

