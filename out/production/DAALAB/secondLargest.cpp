#include <iostream>
#include <climits>
using namespace std;
int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    if (n < 2) {
        cout << "Array must contain at least two elements." << endl;
        return 0;
    }

    int arr[n];

    cout << "Enter " << n << " elements:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int first = INT_MIN, second = INT_MIN;
    for (int i = 0; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i];
        }
    }

    if (second == INT_MIN) {
        cout << "There is no second largest element (all elements are equal)." << endl;
    } else {
        cout << "The second largest element is: " << second << endl;
    }

    return 0;
}

