import java.util.Date;

public class funcionario{
     private String nome;
     private String cpf;
     private Date dataNascimento;
     private float Salario;
     
    public String getNome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
}    
    