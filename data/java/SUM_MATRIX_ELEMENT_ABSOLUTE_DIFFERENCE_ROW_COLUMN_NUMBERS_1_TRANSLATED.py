import sys

def f_gold ( n ) :
    """
 Return the sum of the gold matrix elements in the given order.

 Parameters
 -----
 n : int
 The number of elements in the matrix to be summed.

 Returns
 -----
 sum : int
 The sum of the gold matrix elements.

 Examples
 -----
 >>> from scipy.sparse import csr_matrix, coo_matrix
 >>> A = csr_matrix([[1, 2], [3, 4]])
 >>> B = csr_matrix([[5, 6], [7, 8]])
 >>> C = coo_matrix([[9, 10], [11, 12]])
 >>> sum = sum(A, B, C)
 >>> sum / sum(B, C)
 2
 """
    sum = 0
    for i in range ( n ) :
        sum += i * ( n - i )
    return 2 * sum

if __name__ == '__main__':
    param = [
    (63,),
    (72,),
    (28,),
    (35,),
    (6,),
    (70,),
    (20,),
    (8,),
    (8,),
    (35,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("SUM_MATRIX_ELEMENT_ABSOLUTE_DIFFERENCE_ROW_COLUMN_NUMBERS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
