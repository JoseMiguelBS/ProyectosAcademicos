#include <iostream>



struct CuentaBancaria{
	
	public:
		
		std::string cuenta;
		int saldo;
		std::string sede;
	
};
struct Empresario{
	
	public:
		std::string nombre;
		std::string direccion;
		
		CuentaBancaria cuentaBancaria1;
		
};

struct Carro{
	
	public:
		std::string color="Rojo";
		std::string marca="Mazda";
		void acelerar(){
			std::cout<<"Esta frenando";	
			
		}
		void frenar(){
			
			std::cout<<"Esta frenando";
			
		}
	
};

struct Hijo : public Empresario{
	
	public:
		std::string numeroCelular;
		
		void gastarDinero(){
		std::cout<<"Gasta dinero";
			
		}
		Carro carro1;
		
};

int main(int argc, char** argv) {
	Hijo hijo1;
	
	hijo1.carro1.acelerar();
	

	return 0;
}
