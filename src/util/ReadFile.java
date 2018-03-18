package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadFile {
	public static Iterator<String[]> csv(String filename){
		ArrayList<String[]> testdata=new ArrayList<String[]>();
		try{
			FileReader fr=new FileReader("testdata/"+filename);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine(); //to read the header only
			while((line=br.readLine())!=null){
				String[] data=line.split(",");
				testdata.add(data);
			}
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return testdata.iterator();
	}
}
