#Declaração do problema: Dadas duas matrizes, multiplique-as e retorne a matriz resultante.
  
def matrix_multiply(A, B):
    rows_A = len(A)
    cols_A = len(A[0])
    rows_B = len(B)
    cols_B = len(B[0])
    
    if cols_A != rows_B:
        print("Cannot multiply matrices: incompatible dimensions.")
        return None

    # Initialize the result matrix with zeros
    result = [[0 for _ in range(cols_B)] for _ in range(rows_A)]

    # Perform matrix multiplication
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A): # O certo é usar colunas de A para percorrer
                result[i][j] += A[i][k] * B[k][j]

    return result

def read_matrix():
    try:
        rows = int(input("Enter the number of rows: "))
        cols = int(input("Enter the number of columns: "))
        print("Enter the matrix elements row-wise:")
        matrix = []
        for _ in range(rows):
            row = list(map(int, input().split()))
            if len(row) != cols:
                print("Invalid row length.")
                return None
            matrix.append(row)
        
        return matrix
    except ValueError:
        print("Invalid input. Please enter integers only.")
        return None

def main():
    print("Matrix A:")
    A = read_matrix()
    if A is None:
        return
    print("Matrix B:")
    B = read_matrix()
    if B is None:
        return

    result = matrix_multiply(A, B)
    if result is not None:
        print("Resultant matrix:")
        for row in result:
            print(' '.join(map(str, row)))

if __name__ == "__main__":
    main()