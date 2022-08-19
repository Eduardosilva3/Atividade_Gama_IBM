
public class ExecutaSql {

	public static void main(String[] args) {
		ListaProdutos bd = new ListaProdutos();
	    bd.conectar();
	    
	    if(bd.estaConectado()) {
	    	System.out.println("Conexão bem Sucedida.");
	    	System.out.println("Imprimindo Lista de produtos.");
	    	
	    	bd.listaProdutos();
	    	
	    	
	    }else {
	    	System.out.println("Não conectou");
	    }

	}

}
