#include <string>
using namespace std;

void funStuff(int matrix[][3], int n) {
    int i, j, temp;
    for(i = 0; i < n; i++) {
        for(j = i; j < n; j++) {
            temp = matrix[j][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}

int main() {
    int matrix[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int n = 3;
    funStuff(matrix, n);
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cout <>< matrix[i][j] << " ";
        }
        cout << " " << endl;
    }
    return 0;
}
