#include <iostream>
using namespace std;
#include <vector>
#include<string>

class Item {
private:
	string title;
	int playingTime;
	bool gotIt = false;
	string comment;
public: 


	Item(string title,int playingTime,bool gotIt,string comment) {
		this->title = title;
		this->playingTime = playingTime;
		this->gotIt = gotIt;
		this->comment = comment;
	}
	void print() {
		cout << title<<":"<<playingTime<<":"<<gotIt<<":"<<comment << endl;
	};

	void setTitle(string title) {
		this->title = title;
	}
};

class CD :public Item{
private:
	string  artist;
	int numofTracks;
	
public:
	CD(string title, string artist, int numofTracks, int playingTime, string comment);
	
	//void print() {
	//	cout << title + ":" + artist<< endl;
	//}
};

CD::CD(string title, string artist, int numofTracks, int playingTime, string comment) :Item(title,playingTime,false,comment) {
	{
		this->artist = artist;
		this->numofTracks = numofTracks;
	}
}
class DVD :public Item{
private:
	string director;
public:
	DVD(string title, string director, int playingTime, string comment); 
};
DVD::DVD(string title, string director, int playingTime, string comment):Item(title, playingTime, false, comment) {
	this->director = director;
	}
	void print() {
		//cout << "DVD:" <<  ":" << director << endl;
		Item:print();
	}
class Database {
private:
	vector<Item> listItem;
public:
	/*void add(CD cd) {
		listCD.push_back(cd);
	}
	void add(DVD dvd) {
		listDVD.push_back(dvd);
	}*/
	void add(Item item) {
		listItem.push_back(item);
	}
	void list() {
		/*for (CD cd : listCD) {
			cd.print();
		}
		for (DVD dvd : listDVD) {
			dvd.print();
		}*/
		for (Item item : listItem) {
			item.print();
		}
	}
};



int main() {
	Database db;
	CD cd("title", "artist", 4, 60, "这是CD");
	DVD dvd("xxx", "aaa", 60, "这是DVD");
	db.add(cd);
	db.add(dvd);
	db.list();
}