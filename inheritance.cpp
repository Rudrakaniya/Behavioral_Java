//break_the_bond
//jatt_james_bond
#include<bits/stdc++.h>
using namespace std;

class STUDENT{
    public:
        string name;
        int rollNo, phyMarks, cheMarks, mthMarks;
    void input(){
        cout << "Enter your name = ";
        cin >> name;
        cout << "Enter your roll no = ";
        cin >> rollNo;
        cout << "Enter your marks in physics = ";
        cin >> phyMarks;
        cout << "Enter your marks in chemistry = ";
        cin >> cheMarks;
        cout << "Enter your marks in maths = ";
        cin >> mthMarks;
    }
};

class SPORTS{
    public:
        int sportsMarks;

    void input(){
        cout << "Enter your marks in sports = ";
        cin >> sportsMarks;
    }
};

class RESULT: public STUDENT, public SPORTS{
    public:
        STUDENT o1;
        SPORTS b2;
        RESULT(STUDENT obj1, SPORTS obj2)
        {
            o1 = obj1;
            b2 = obj2;
        }

        float percentage;
    void show(){
        percentage = (((float)o1.phyMarks + o1.cheMarks + o1.mthMarks + b2.sportsMarks) / 400) * 100;
        cout << endl;
        cout << "Name of the student is " << o1.name << endl;
        cout << "Roll number of the student is " << o1.rollNo << endl;
        cout << "Percentage of the student is " << percentage << endl;
    }
};

int main()
{
    STUDENT obj1;
    obj1.input();

    SPORTS obj2;
    obj2.input();

    RESULT obj3(obj1, obj2);
    obj3.show();

    return 0;
}
