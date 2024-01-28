#include <iostream>
using namespace std ;
int main() {
    double a , ft = 30.48 ;
    cin >> a ;
    cout << fixed ;
    cout.precision(1) ;
    cout << a * ft ;
    return 0;
}