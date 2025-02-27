#include <iostream>
using namespace std;

class A {
public:
  	int n;
    int f1() {
      	n += 4;
        int m = f2();
        return n + m + 1;
    }
    int f2() {
      	n += 1;
        return n;
    }
    int f3() {
    	f1();
        return n;
    }
};
class B : public A {
public:
	int f1() {
          n -= 4;
          int m = f2();
          return n - m;
	}
    int f2() {
      	n += n;
        return n;
    }
    int f3() {
      	f2();
        return n;
    }
};
int main() {
	cout << "Dynamic binding: " << endl;
  	A* b = new B();
    b->n = 4;
    cout << b->f3() << endl;
	cout << b->f1() << ' ' << b->f2() << endl;
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
