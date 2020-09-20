import Foundation



guard let N = Int((readLine()?.trimmingCharacters(in: .whitespacesAndNewlines))!)
else { fatalError("Bad input") }

if (N % 2 != 0) {
    print("Weird")
} else if (N <= 5 && N >= 2){
    print("Not Weird")
} else if (N >= 6 && N <= 20) {
    print("Weird")
} else {
    print("Not Weird")
}

