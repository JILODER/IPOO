import java.util.Vector;

public class ARBA{
    private Vector<Cobro> cobros;
    
    public ARBA(){
        cobros = new Vector<Cobro>();
    }
    
    public void agregarCobroCouta(Bien bien, int meses){
        CobroCuota cobro = new CobroCuota(bien, meses);
        cobros.add(cobro);
    }
    
    public void agregarCobroAnual(Bien bien){
        CobroAnual cobro = new CobroAnual(bien);
        cobros.add(cobro);
    }
    
    public float valorCobro(Cobro cobro){
        return cobro.calcularImporte();
    }
    
    public float sumaCobros(){
        float suma = 0;
        for(Cobro c : cobros){
            suma += valorCobro(c);
        }
        return suma;
    }
    
    public Cobro cobroMayor(){
        if(cobros.isEmpty()){
            return null;
        }
        Cobro mayor = cobros.get(0);
        for(Cobro c : cobros){
            if(valorCobro(c) > valorCobro(mayor)){
                mayor = c;
            }
        }
        return mayor;
    }
    
    public Vector<Cobro> cobrosMayoresA(float valor){
        Vector<Cobro> mayores = new Vector<Cobro>();
        for(Cobro c : cobros){
            if(valorCobro(c) > valor){
                mayores.add(c);
            }
        }
        return mayores;
    }
    
    public float valorFiscal(){
        float total = 0;
        Vector<Bien> bienesContados = new Vector<>();
        for(Cobro c : this.cobros){
            total += c.getBien().getValorFiscal();
        }
        return total;
    }
}