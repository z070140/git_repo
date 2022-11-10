// vector::reserve
#include <iostream>
#include <vector>

int main()
{
    std::vector<int>::size_type sz;

    std::vector<int> foo;
    sz = foo.capacity();
    std::cout << "making foo grow:\n";
    for (int i = 0; i < 100; ++i) {
        foo.push_back(i);
        std::cout << "capacity  " << sz << '\n';
        if (sz != foo.capacity()) {
            sz = foo.capacity();
            std::cout << "capacity changed: " << sz << '\n';
        }
    }

    std::vector<int> bar;
    sz = bar.capacity();
   std:: cout << sz+"\n";
    bar.reserve(100);   // this is the only difference with foo above
    std::cout << "making bar grow:\n";
    for (int i = 0; i < 200; ++i) {
        bar.push_back(i);
        std::cout << "capacity: " << sz << '\n';
        if (sz != bar.capacity()) {
            sz = bar.capacity();
            std::cout << "capacity changed: " << sz << '\n';
        }
    }
    std::cout << "capacity: " << sz << '\n';
    return 0;
}