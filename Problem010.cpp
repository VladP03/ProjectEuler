/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

#include <iostream>

using namespace std;

bool isPrime(long number) {

	for (long long int i = 2; i <= sqrt((unsigned long long int (number))); i++) {
		if (number % i == 0) {
			return false;
		}
	}

	return true;
}

int main(void) {

	unsigned long long int sum = 0;
	for (long long int i = 2; i < 2000000; i++) {
		if (isPrime(i)) {
			//cout << i << " ";
			sum += i;
		}
	}

	cout << sum;

	return 0;
}
