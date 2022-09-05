public class Vendedor extends funcionario {
    

    private float comissaoPoritem;
    private int totalItensvendidos;
     
    public Vendedor() {
    super();
    }
    public float calcularSalario(){
      return super.getSalario() + (this.comissaoPoritem * totalItensvendidos); 
    } 
    public int gettotalItensvendidos(){
        return (int) totalItensvendidos;
    }
    public void settotalItensvendidos(int totalItensvendidos){
        this.totalItensvendidos = totalItensvendidos;
    }

    public float getComissaoPoritem() {
        return comissaoPoritem;
    }

    public void setComissaoPoritem(float comissaoPoritem) {
        this.comissaoPoritem = comissaoPoritem;
    }    
}