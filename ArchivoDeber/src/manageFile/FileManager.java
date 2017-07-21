package manageFile;
import java.io.File;
import java.io.FileWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


/**
 * La clase FileManager corresponde a la ejecucion de las funciones save y find
 * @author Kevin
 *
 */

public class FileManager {
	/**
	 * La funcion save sirve para guardar en un Archivo .csv algunos datos 
	 * @param table tipo String corresponde una cadena
	 * @param data tipo String corresponde a lod datos ingresados
	 */
	
	public void save(String table, String data)
	{
		String ruta = data;
		Boolean existe = new File(ruta).exists();//PARA SABER SI EXISTE EL ARCHIVO
		
		try{
			
			CsvWriter csvEscribir = new CsvWriter (new FileWriter(ruta,true), ',');
			
				csvEscribir.write(table);
				//csvEscribir.write
				csvEscribir.endRecord();
	
			csvEscribir.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * Este metodo sirve para buscar en el Archivo
	 * @param id de tipo String que se ingresa para poder buscar
	 * @param ruta1 de tipo String que se usa para dar el nombre de la ruta de nuestro archivo
	 */
	/*public void find(String id,String ruta1) 
	{
		String palabra,dato3;
		String llena[]=new String[4];
		int i=0,j=0;
			try
			{
				CsvReader documento = new CsvReader(ruta1);
				while(documento.readRecord())
				{
					if(ruta1.equals("Costumer.csv")==true)
					
					{
						Costumer [] cliente=new Costumer[10];
						palabra=documento.get(i);
						StringTokenizer st = new StringTokenizer (palabra,";");
						while (st.hasMoreTokens())
				          {
				              palabra = st.nextToken();
				              llena[j]=palabra;
				              j++;
			              }
						cliente[i]=new Costumer(llena[0],llena[1], llena[2], llena[3]);
						if(cliente[i].getId().equals(id))
						{
							System.out.println("Se encontro el cliente"+cliente[i].getName());
							return;
						}
						i++;
					}
					else
					{
						Employee [] empleado=new Employee[10];
						palabra=documento.get(i);
						StringTokenizer st = new StringTokenizer (palabra,";");
						while (st.hasMoreTokens())
				          {
				              palabra = st.nextToken();
				              llena[j]=palabra;
				              j++;
			              }
						empleado[i]=new Employee(llena[0],llena[1], llena[2], Float.parseFloat(llena[3]));
						if(empleado[i].getId().equals(id))
						{
							System.out.println("Se encontro el empleado: "+empleado[i].getName());
							//return;
						}
						i++;
					}
				}
			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}*/
}
