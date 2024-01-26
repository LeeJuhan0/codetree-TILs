#include <iostream>
using namespace std;
int main() {
    int a = 5 , b = 6 , c = 7 , t ;
    
    t = a ;
    a = c ;
    c = b ;
    b = t ;

    cout << a << endl << b << endl << c ;
    return 0;
}