import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 

public class ListaProdutos {
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null;
	
	
	//conexão do banco de dados
		public void conectar() {
			//Criando a variável de conexão do DataBase
			String servidor ="jdbc:mysql://localhost/ibm";
			//Usuário do banco de dados
			String usuario="root";
			//Senha do usuário do banco de dados
			String senha="123456";
			//driver de conexão
			String driver = "com.mysql.cj.jdbc.Driver";
			
			// Criação do nosso Try Catch
			try {
				Class.forName(driver);
				this.connection=DriverManager.getConnection(servidor,usuario,senha);
				this.statement=this.connection.createStatement();
				
			}catch (Exception e) {
				System.out.println("Erro:"+e.getMessage());
			}
		}
		
			//Retorno do método de conexão
			public boolean estaConectado() {
				if(this.connection !=null) {
					return true;
				}else {
					return false;
				}
			}
			
			public void listaProdutos() {
				
				try {
					
					String query = "select * from produtos";
					this.resultset = this.statement.executeQuery(query);
					this.statement=this.connection.createStatement();
					
					while(this.resultset.next()) {
						
						String meuID = resultset.getString("id_produto");
						String nomeP= resultset.getString("nome_produto");
						String valor= resultset.getString("valor_unitario");
						String quant = resultset.getString("qtd_produto");
						String codMarca= resultset.getString("cod_marca");
						
						System.out.println("id:"+meuID + " Nome: "+nomeP+ " Valor: " + valor+ " Quantidade: "+quant+" Codigo da marca: "+codMarca);
						System.out.println("");
						
					}
					}catch(Exception e ) {
						System.out.println("Erro"+e.getMessage());
					}
				}
}
