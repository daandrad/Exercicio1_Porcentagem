
import java.util.Date;

class Main {
  public static void main(String[] args) {
    
    Vendedor V = new Vendedor();
    V.setnome("Daniel");
    V.setCpf("52416378945");
    V.setSalario(45000);
    V.setDataNascimento(new Date());
    V.setComissaoPoritem(10.0f);
    V.settotalItensvendidos(10);
        
    System.out.println("O salario do vendedor é: " + 
    V.calcularSalario());
        
    Motorista M = new Motorista();
    
  }
}