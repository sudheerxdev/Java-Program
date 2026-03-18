#include<iostream>
using namespace std;
int maxi(int a , int b , int c , int d){
    int maxim = a ; 
    if(b > maxim ) maxim = b ;
    if(c > maxim ) maxim = c ;
    if(d > maxim) maxim = d;
}
int main(){
    int a  , b  , c , d;
    cin >> a >> b >> c >> d ;
    cout << maxi( a , b , c , d);
}
