#include<iostream>
using namespace std;
#define BLOCK_SIZE  20
class Array {
public:
	Array(int init_size) {
		this->size =init_size;
		this->array = (int*)malloc(sizeof(int) * this->size);
	}
	void array_free() {
		free(this->array);
		this->array = NULL;
		this->size = 0;
	}
	int array_size() {
		return this->size;
	}
	int* array_at(int index) {
		if (index >= this->size) {
			array_inflate((index/BLOCK_SIZE+1)*BLOCK_SIZE-size);
		}
		return &array[index];
	}
	int arrag_get(int index) {
		return array[index];
	}
	void array_set(int index,int value) {
		array[index] = value;
	}
	void array_inflate(int more_size) {
		int*p = (int*)malloc(sizeof(int) * (this->size+more_size));
		int i;
		for (i = 0; i < size; i++) {
			p[i] = array[i];
		}
		free(array);
		array = p;
		size += more_size;
	}

private:
	int* array;
	int size;
};

int main() {
	Array a(21);
	printf("%d\n", a.array_size());
	int number=0;
	int cnt = 0;
	while (number != -1) {
		cin >> number;
		if (number != -1) {
			*a.array_at(cnt++) = number;
		}
		else {
			break;
		}
	}
	for (int i = 0; i < a.array_size(); i++) {
		cout << *a.array_at(i) << endl;
	}
	a.array_free();
}