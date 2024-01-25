package exercises;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	public static void main(String[] args) {
		Doctor doctor=new Doctor();
		GeneralPractitoner gp = new GeneralPractitoner();  
		Surgeon surgeon = new Surgeon();
	    List<Object> listOfDoctors= List.of(gp,surgeon);
        for (Object doctorList:listOfDoctors)
        {
        	((Doctor) doctorList).doMedicine();
        }
	}

}
