/// 18460120 PARTIDA CONTRERAS LUIS EMILIO
package archivo;


public class Cliente {
    private String nombre;
    private int estatura;
    private boolean sexo;    
    private float peso,alto,bajo,ideal;

    public Cliente(String nombre, int estatura, boolean sexo, float peso, float alto, float bajo, float ideal) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.sexo = sexo;
        this.peso = peso;
        this.alto = alto;
        this.bajo = bajo;
        this.ideal = ideal;
    }

    public Cliente(String nombre, int estatura, boolean sexo,float peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.sexo = sexo;
        this.peso=peso;
    }
    
    

  
    public Cliente(){
        
    }
    

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    
    public float getIdeal() {
        return ideal;
    }

    public void setIdeal(float ideal) {
        this.ideal = ideal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getBajo() {
        return bajo;
    }

    public void setBajo(float bajo) {
        this.bajo = bajo;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    
}
