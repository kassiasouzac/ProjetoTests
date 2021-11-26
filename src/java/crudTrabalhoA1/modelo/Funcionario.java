package crudTrabalhoA1.modelo;

public class Funcionario {
    
    private Integer Codigo_Funcionario;
    private String Nome_Completo;
    private String Numero_RG;
    private String Orgao_Emissor;
    private String Numero_CPF;
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Telefone;
    private String Celular;
    private String Numero_CTPS;
    private String Numero_PIS;
    private String Data_Nascimento;

    
 
    public Integer getCodigo_Funcionario() {
        return Codigo_Funcionario;
    }

    public void setCodigo_Funcionario(Integer Codigo_Funcionario) {
        this.Codigo_Funcionario = Codigo_Funcionario;
    }

    public String getNome_Completo() {
        return Nome_Completo;
    }

    public void setNome_Completo(String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    public String getNumero_RG() {
        return Numero_RG;
    }

    public void setNumero_RG(String Numero_RG) {
        this.Numero_RG = Numero_RG;
    }

    public String getOrgao_Emissor() {
        return Orgao_Emissor;
    }

    public void setOrgao_Emissor(String Orgao_Emissor) {
        this.Orgao_Emissor = Orgao_Emissor;
    }

    public String getNumero_CPF() {
        return Numero_CPF;
    }

    public void setNumero_CPF(String Numero_CPF) {
        this.Numero_CPF = Numero_CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getNumero_CTPS() {
        return Numero_CTPS;
    }

    public void setNumero_CTPS(String Numero_CTPS) {
        this.Numero_CTPS = Numero_CTPS;
    }

    public String getNumero_PIS() {
        return Numero_PIS;
    }

    public void setNumero_PIS(String Numero_PIS) {
        this.Numero_PIS = Numero_PIS;
    }

    public String getData_Nascimento() {
        return Data_Nascimento;
    }

    public void setData_Nascimento(String Data_Nascimento) {
        this.Data_Nascimento = Data_Nascimento;
    }
    
    public boolean validaCPF() {
		if(true) {
			return true;
		} else {
			return false;
		}
	}
    public boolean validaPIS() {
		if(true) {
			return true;
		} else {
			return false;
		}
	}
    public boolean validaCTPS() {
		if(true) {
			return true;
		} else {
			return false;
		}
	}
}
