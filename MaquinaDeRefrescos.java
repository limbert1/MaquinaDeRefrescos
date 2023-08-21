
public class MaquinaDeRefrescos
{
    private int costo;
    private int cantidad;
    private int caja;

    
    public MaquinaDeRefrescos()
    {
         this.costo=0;
         this.cantidad=0;
         this.caja=0;
    }
    
    public MaquinaDeRefrescos(int costo, int cantidad, int caja)
    {
    this.costo=costo;
    this.cantidad=cantidad;
    this.caja=caja;
    }
    
    public int getCosto(){
        return this.costo;
    }
    public void setCosto(int costo){
        this.costo=costo;
    }
  
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public int getCaja(){
        return this.caja;
    }
    public void setCaja(int caja){
        this.caja=caja;
    }
    
    public void solicitarRefresco(int dinero){
        if (dinero==this.getCosto()){
            //entrega del refresco previa verificacion
        if(this.getCantidad()>0){
            ///entrega el refresco
            this.setCantidad(this.getCantidad() -1);
            this.setCaja(this.getCaja()+ dinero);
            System.out.println("------------");
            System.out.println("recoje tu refresco");
            System.out.println("gracias [por tu compra");
            System.out.println("------------");
        }
        else{
            System.out.println("------------");
            System.out.println("lo siento no hay refrescos");
            System.out.println("------------");
        }
        }
        else {
            System.out.println("------------");
            System.out.println("El costo del refesco es:"+this.getCosto());
            System.out.println("------------");
        }
    }
    
    public void ActualizarPrecio (int nuevoCosto){
        this.setCosto(nuevoCosto);
        System.out.println("------------------");
        System.out.println("El costo se actualizo a $:" +this.getCosto());
        System.out.println("------------------");
    }
    public void llenarMaquina (int cantidad){
        this.setCantidad(this.getCantidad() + cantidad);
         System.out.println("------------------");
        System.out.println("La maquina tiene:" +this.getCantidad()+ "esta cantidad de refrescos");
        System.out.println("------------------");
        
    }
    public void mostrarEstado(){
        System.out.println("Estado de la maquina");
        System.out.println("Costo del refresco es:"+ this.getCosto());
        System.out.println("Cantidad de refresco es:" + this.getCantidad());
        System.out.println("Cantidad de caja es:"+ this.getCaja());
        
    }
}
