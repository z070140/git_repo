#include <iostream>
using namespace std;


class Node {
public:
	int value;
	Node* next;
};

int main() {
	Node* head = NULL;
	int number;
	do {
		cin >> number;
		if (number != -1) {
			// add to linked-list
			Node* p = (Node*)malloc(sizeof(Node));
			p->value = number;
			p->next = NULL;
			// find the last
			Node* last = head;
			if (last->next) {
			while (last->next) {
				last = last->next;
			}
			last->next = p;
			}
			else {
				head = p;
			}
		}
	} while (number != -1);

	return 0;
}