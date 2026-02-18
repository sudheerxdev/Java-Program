#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin >> T;

    while (T--) {
        long long N, A, B;
        cin >> N >> A >> B;

        if (N < A) {
            cout << N << "\n";
        } else {
            long long D = A - B;
            long long ans = ((N - A) % D) + B;
            cout << ans << "\n";
        }
    }
}
