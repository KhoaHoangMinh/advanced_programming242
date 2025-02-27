#include <iostream>
using namespace std;

class A {
public:
  	int n;
    virtual int f1() {
      	n += 4;
        int m = f2();
        return n + m + 1;
    }
    virtual int f2() {
      	n += 1;
        return n;
    }
    virtual int f3() {
    	f1();
        return n;
    }
};
class B : public A {
public:
	int f1() override {
	n -= 4;
	int m = f2();
	return n - m;
	}
    int f2() override {
      	n += n;
        return n;
    }
    int f3() override {
      	f2();
        return n;
    }
};
int main() {
	cout << "Dynamic binding: " << endl;
  	A* b = new B();
    b->n = 4;
	// Resolved at runtime based on the type of object (B)
    cout << b->f3() << endl;	// 9
	cout << b->f1() << ' ' << b->f2() << endl;	// 0 0
	cout << b->f2() << endl;
	delete b;

	cout << "Static binding: " << endl;
	B bStatic;
	bStatic.n = 4;
	cout << bStatic.f1() << ' ' << bStatic.f2() << endl;
	cout << bStatic.f3() << endl;
	cout << bStatic.f1() << ' ' << bStatic.f3() << endl;
	return 0;
}
