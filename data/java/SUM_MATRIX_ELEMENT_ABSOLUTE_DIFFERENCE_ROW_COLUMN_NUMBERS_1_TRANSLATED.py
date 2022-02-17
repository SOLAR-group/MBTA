====================
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

