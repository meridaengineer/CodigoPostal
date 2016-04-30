import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Codigo{
	public static void contenido(String Postales) throws FileNotFoundException,IOException {
		FileReader p=new FileReader(Postales);
		BufferedReader b=new BufferedReader(p);
        System.out.println("INGRESE EL CODIGO POSTAL QUE DESEA BUSCAR(5 DIGITOS):\n");
        Scanner red = new Scanner(System.in);
        String cad;
        cad=red.nextLine();
       
     
        //String cadena=red.toString();
       

        
        
        if(cad.length()!=5){
        	System.out.println("no es valido este codigo postal");
        }
        else{
  			//int r=red.nextint();
        	String codigo="";
     		//codigo=b.readLine();
     		//while(codigo!=null)
     		while((codigo=b.readLine())!=null)
     		{
     			
     			if(codigo.startsWith(cad)){
     				StringTokenizer st=new StringTokenizer(codigo,"|");
     				System.out.println("--------------------------------------------------------------------------------");
     				System.out.println("Codigo:\t"+st.nextElement().toString()+"\tasentamiento:\t"+st.nextElement().toString());
     				System.out.println("\ntipo de asentamiento:\t"+st.nextElement().toString()+"\t\tmunicipio:\t"+st.nextElement().toString());
     				System.out.println("\nEstado:\t"+st.nextElement().toString()+"\td_ciudad:\t"+st.nextElement().toString());
     				System.out.println("\nd_cp:\t"+st.nextElement().toString()+"\tc_Estado:\t"+st.nextElement().toString());
     				System.out.println("\nc_oficina:\t"+st.nextElement().toString()+"\tc_tipo_asentamiento:\t"+st.nextElement().toString());
     				System.out.println("\nC_municipio:\t"+st.nextElement().toString()+"\tid_asenta_CPcons:\t"+st.nextElement().toString());
     				System.out.println("\nd_zona:\t"+st.nextElement().toString()+"\nc_cve_ciudad:\t"+st.nextElement().toString());
     				//System.out.println("c_cve_ciudad:\t"+st.nextElement().toString());
     				System.out.println("--------------------------------------------------------------------------------");
     			//System.out.println("c_CP:\n"+st.nextElement().toString());
     			}
     			

     		}
     		b.close();
     	}
	}


	public static void main(String[] args) throws FileNotFoundException, IOException  {
		contenido("Postales.txt");
		
	}
	
}