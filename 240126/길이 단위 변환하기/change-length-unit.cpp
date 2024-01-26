#include <iostream>
using namespace std ;
int main() {
    double ft = 30.48 , mi = 160934 , a = 9.2 , b = 1.3 ;

    cout << fixed;
    cout.precision(1) ;
    cout << a << "ft " << "= " << a*ft << "cm" << endl << b << "mi " << "= " << b*mi << "cm" ; 
    return 0;
}