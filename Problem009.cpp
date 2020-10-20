/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
				a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

#include <iostream>

using namespace std;

void findABC(int& a, int& b, int& c) {

	bool done = false;
	for (int i = 1; i < 1000 && done == false; i++) {
		for (int j = 1; j < 1000 && done == false; j++) {
			for (int k = 1; k < 1000; k++) {
				if (i + j + k == 1000) {
					if (i * i + j * j == k * k || i * i + k * k == j * j || j * j + k * k == i * i) {
						a = i;
						b = j;
						c = k;
						done = true;
						break;
					}
				}
			}
		}
	}
}

int main(void) {


	int a, b, c;
	findABC(a, b, c);
	cout << "a= " << a;
	cout << "\nb= " << b;
	cout << "\nc= " << c;

	cout << "\na*b*c = " << a * b * c;
	return 0;
}
