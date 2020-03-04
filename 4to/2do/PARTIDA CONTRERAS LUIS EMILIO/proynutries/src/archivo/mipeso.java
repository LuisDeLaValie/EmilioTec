/// 18460120 PARTIDA CONTRERAS LUIS EMILIO
package archivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;


public class mipeso {
    private List<Cliente> lista=new LinkedList<>();
    private Cliente peso= new Cliente();
    private int ide;
    
    public int items(){
        return lista.size();
    }
    
    public Cliente traercliente(int id){
        ide=id;
        peso=lista.get(id);
        return peso;
    }
    
    public void editar(Cliente cli){
        lista.set(ide, cli);
        escribir();
        leer();
    }
    
    public void agregar(Cliente cli){
        lista.add(cli);
        escribir();
        leer();
    }
    
   public void escribir(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("lista.text");//obtener archivo a escribir
            pw = new PrintWriter(fichero);//escribir en el archivo
            for (Cliente cliente : lista) {
                pw.println(cliente.getNombre()+"-"+cliente.getEstatura()+"-"+cliente.isSexo()+"-"+cliente.getPeso()+"-"+cliente.getAlto()+"-"+cliente.getBajo()+"-"+cliente.getIdeal());//se escribe
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public void leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Users\\PROGRAMAR\\Desktop\\Notas de clase 20_03_19.txt");
         fr = new FileReader ("lista.text");//obtener archivo a leer
         br = new BufferedReader(fr);//cargar contenido del archivo

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
             
             System.out.println(linea);
            String nombre=linea.split("-")[0];
            int esta=Integer.parseInt(linea.split("-")[1]);
            boolean sex=Boolean.parseBoolean(linea.split("-")[2]);
            float a=Float.parseFloat(linea.split("-")[3]);
            float a1=Float.parseFloat(linea.split("-")[4]);
            float a2=Float.parseFloat(linea.split("-")[5]);
            float a3=Float.parseFloat(linea.split("-")[6]);
            lista.add(
                new Cliente(nombre, esta, sex, a, a1, a2, a3)
            );//imprimir en consola el archivo
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
    
    
}
