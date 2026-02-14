int nextPrime(int n) {
    for (int i = n + 1; ; i++) {
        bool isprime = true;
        
        if (i < 2) continue; // primes start from 2
        
        // Check divisibility up to sqrt(i)
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isprime = false;
                break;
            }
        }
        
        if (isprime) {
            return i; // first prime found
        }
    }
}
