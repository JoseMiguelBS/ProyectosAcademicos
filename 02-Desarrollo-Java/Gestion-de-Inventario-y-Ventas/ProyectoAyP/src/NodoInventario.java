
public class NodoInventario {
	    
	    private String nombreProducto;
	    private double precioProducto;
	    
	    private NodoInventario next = null;
	    
	    public NodoInventario getNext() {
	        return next;
	    }

	    public NodoInventario(String nombreProducto, double precioProducto, NodoInventario next) {
	    	
			this.nombreProducto = nombreProducto;
			this.precioProducto = precioProducto;
			this.next = next;
		}

		public void setNext(NodoInventario next) {
	        this.next = next;
	    }

		public String getNombreProducto() {
			return nombreProducto;
		}

		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}

		public double getPrecioProducto() {
			return precioProducto;
		}

		public void setPrecioProducto(double precioProducto) {
			this.precioProducto = precioProducto;
		}

		public NodoInventario(String nombreProducto, double precioProducto) {

			this.nombreProducto = nombreProducto;
			this.precioProducto = precioProducto;
		}
	}

