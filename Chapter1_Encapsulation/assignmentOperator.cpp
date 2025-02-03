
#include <iostream>
using namespace std;
class A
{
protected:
    int a;
public:
    A() {a = 10;}
    int f() {a++; return a;}
    int geta() {return a;}
};

class B: public A
{
public:
    int f() {a--; return a;}
};

int main()
{
    A a,a2;
    B b;

    a.f();
    b.f();
    a2 = b;
    a2.f();
    std::cout << a.geta() << " "<< b.geta() << " " << a2.geta() << endl;

    return 0;
}
