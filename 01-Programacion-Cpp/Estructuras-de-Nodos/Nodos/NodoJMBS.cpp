#include <iostream>
using namespace std;


struct Node {
	
	public:
		int dato;
		int size=0;
		Node* next=NULL;
		Node(int dato){
			
			this->dato=dato;
		}
		
	
};

class LinkList{
  public: 
        int size=0;
        Node * head=NULL;
        void InsertarNodoPrincipio(int dato){
		
		Node* newNode = new Node(dato);
		
		if(head==NULL){
			
			head=newNode;	
			size ++;
		}else{
			
			newNode->next=head;
			head=newNode;
			size ++;
			
		}
		}
		void InsertarNodoFinal(int dato){
			Node* newNode= new Node(dato);
			if(head==NULL){
				
				head=newNode;
				size ++;
			}
			else{
				Node* pointer=head;
				 while(pointer->next !=NULL){
				 	
				 	pointer=pointer->next;
				 		
				 }
				 pointer->next=newNode;
				size ++;
				
			}
			
		}
		void MostrarNodos(int dato){
			
			Node* pointer=head;
			while(pointer!=NULL){
			std::cout<<pointer->dato<<endl;
				pointer=pointer->next;
				
			}
			
			
		}
	

};

int main(int argc, char** argv) {
	
    LinkList* mostrar = new LinkList;
	
		
         mostrar->InsertarNodoPrincipio(3);
         mostrar->InsertarNodoPrincipio(6);
	     mostrar->InsertarNodoFinal(2);
         mostrar->InsertarNodoFinal(9);
         mostrar->MostrarNodos(10);
        
       
	
	
	return 0;
}
