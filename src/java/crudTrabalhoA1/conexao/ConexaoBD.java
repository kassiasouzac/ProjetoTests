package crudTrabalhoA1.conexao;
import crudTrabalhoA1.modelo.Funcionario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConexaoBD {
	// conexão com banco de dados
		static String driver = "com.mysql.cj.jdbc.Driver";
		static String url = "jdbc:mysql://localhost:3306/clinica_medica?useLegacyDatetimeCode=false&serverTimezone=America/Sao_Paulo";
		static String usuario = "root";
		static String senha = "root";
		static String sql;

    

		public static Connection conectar() {
			try {
				// Definindo o driver de conexão para o MYSQL
				Class.forName(driver);
				System.out.println("Até aqui funcionou");
				// Criação da conexão com o banco de dados MYSQL
				Connection con = DriverManager.getConnection(url, usuario, senha);
				System.out.println("Sucesso ao conectar com BD");
				return con;
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Falha");
				e.printStackTrace();
				return null;
			}
		}
                
		public static int Insert(Funcionario funcionario) {
			sql = "INSERT INTO funcionarios (Nome_Completo,Data_Nascimento,Numero_RG,Orgao_Emissor,Numero_CPF,Endereco,Numero,"
                                + "Complemento,Bairro,Cidade,Estado,Telefone,Celular,Numero_CTPS,Numero_PIS) "
				+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Connection con = conectar();                                                                        
			int result=0;
			try {
				PreparedStatement ps;
                            ps = con.prepareStatement(sql);
				ps.setString(1, funcionario.getNome_Completo());
                                ps.setString(2, funcionario.getData_Nascimento());
				ps.setString(3, funcionario.getNumero_RG());
				ps.setString(4, funcionario.getOrgao_Emissor());
				ps.setString(5, funcionario.getNumero_CPF());
                                ps.setString(6, funcionario.getEndereco());
                                ps.setString(7, funcionario.getNumero());
                                ps.setString(8, funcionario.getComplemento());
                                ps.setString(9, funcionario.getBairro());
                                ps.setString(10, funcionario.getCidade());
                                ps.setString(11, funcionario.getEstado());
                                ps.setString(12, funcionario.getTelefone());
                                ps.setString(13, funcionario.getCelular());
                                ps.setString(14, funcionario.getNumero_CTPS());
                                ps.setString(15, funcionario.getNumero_PIS());                                
				result = ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
                
                public static ArrayList<Funcionario> getFuncionariosLista(){
			sql = "select * from funcionarios";
			Funcionario funcionario;
			Connection con = conectar();
			ResultSet rs;
			ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while (rs.next()) {
					funcionario = new Funcionario();
					funcionario.setCodigo_Funcionario(rs.getInt("Codigo_Funcionario"));
					funcionario.setNome_Completo(rs.getString("Nome_Completo"));
                                        funcionario.setData_Nascimento(rs.getString("Data_Nascimento"));                                         
                                        funcionario.setNumero_RG(rs.getString("Numero_RG"));
                                        funcionario.setOrgao_Emissor(rs.getString("Orgao_Emissor"));
                                        funcionario.setNumero_CPF(rs.getString("Numero_CPF"));
                                        funcionario.setEndereco(rs.getString("Endereco"));
                                        funcionario.setNumero(rs.getString("Numero"));
                                        funcionario.setComplemento(rs.getString("Complemento"));
                                        funcionario.setBairro(rs.getString("Bairro"));
                                        funcionario.setCidade(rs.getString("Cidade"));
                                        funcionario.setEstado(rs.getString("Estado"));
                                        funcionario.setTelefone(rs.getString("Telefone"));
                                        funcionario.setCelular(rs.getString("Celular"));
                                        funcionario.setNumero_CTPS(rs.getString("Numero_CTPS"));
                                        funcionario.setNumero_PIS(rs.getString("Numero_PIS"));                                                                     
					lista.add(funcionario);
				}

				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
		}
                
		public static int Delete(int Codigo_Funcionario) {
			sql = "DELETE FROM funcionarios WHERE Codigo_Funcionario = ?";
			Connection con = conectar();
			int result=0;
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Codigo_Funcionario);
				result = ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
                
                
                public static int Update(Funcionario funcionario) {
                    
			sql = "update funcionarios set Nome_Completo=?,Data_Nascimento=?,Numero_RG=?,Orgao_Emissor=?,Numero_CPF=?,Endereco=?,"
                                + "Numero=?,Complemento=?,Bairro=?,Cidade=?,Estado=?,Telefone=?,Celular=?,Numero_CTPS=?,Numero_PIS=? where Codigo_Funcionario=? ";
			Connection con = conectar();
			int result=0;
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, funcionario.getNome_Completo());
                                ps.setString(2, funcionario.getData_Nascimento());
                                ps.setString(3, funcionario.getNumero_RG());
				ps.setString(4, funcionario.getOrgao_Emissor());
                                ps.setString(5, funcionario.getNumero_CPF());
				ps.setString(6, funcionario.getEndereco());
                                ps.setString(7, funcionario.getNumero());
				ps.setString(8, funcionario.getComplemento());
                                ps.setString(9, funcionario.getBairro());
				ps.setString(10, funcionario.getCidade());
                                ps.setString(11, funcionario.getEstado());
				ps.setString(12, funcionario.getTelefone());
                                ps.setString(13, funcionario.getCelular());
                                ps.setString(14, funcionario.getNumero_CTPS());
                                ps.setString(15, funcionario.getNumero_PIS());
                                ps.setInt(16, funcionario.getCodigo_Funcionario());
				result = ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
                }      
                
		public static Funcionario getFuncionario(int Codigo_Funcionario){
			sql = "SELECT * FROM funcionarios WHERE Codigo_Funcionario = ?";
			Funcionario Funcionario = null;
			Connection con = conectar();
			ResultSet rs;
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Codigo_Funcionario);
				rs = ps.executeQuery();
				if (rs.next()) {
                                    Funcionario = new Funcionario();
                                        Funcionario.setCodigo_Funcionario(rs.getInt("Codigo_Funcionario"));
					Funcionario.setNome_Completo(rs.getString("Nome_Completo"));
                                        Funcionario.setData_Nascimento(rs.getString("Data_Nascimento"));
                                        Funcionario.setNumero_RG(rs.getString("Numero_RG"));
                                        Funcionario.setOrgao_Emissor(rs.getString("Orgao_Emissor"));
                                        Funcionario.setNumero_CPF(rs.getString("Numero_CPF"));
                                        Funcionario.setEndereco(rs.getString("Endereco"));
                                        Funcionario.setNumero(rs.getString("Numero"));
                                        Funcionario.setComplemento(rs.getString("Complemento"));
                                        Funcionario.setBairro(rs.getString("Bairro"));
                                        Funcionario.setCidade(rs.getString("Cidade"));
                                        Funcionario.setEstado(rs.getString("Estado"));
                                        Funcionario.setTelefone(rs.getString("Telefone"));
                                        Funcionario.setCelular(rs.getString("Celular"));
                                        Funcionario.setNumero_CTPS(rs.getString("Numero_CTPS"));
                                        Funcionario.setNumero_PIS(rs.getString("Numero_PIS"));
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return Funcionario;
		}	
	}