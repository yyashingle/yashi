#include<bits/stdc++.h>
using namespace std;
class A
{
	public:
		virtual void fun1()
		{
			cout<<"inside fun1  of class A"<<endl;
		}
		
};
class B:public A
{
	public:
		void fun1()
		{
			cout<<"inside fun1 of class B"<<endl;
		}
};
int main()
{
	
	
	A*ptr;
	A obj;
	ptr=&obj;
	ptr->fun1();
    
    B obj2;
    ptr=&obj2;
    ptr->fun1();
    
    ifstream infile("A.txt");
	infile.read((char*)&obj,sizeof(A));
	infile.close();
    
    ofstream outfile("A.txt");
	outfile.write((char*)&obj,sizeof(A));
	outfile.close();
}

