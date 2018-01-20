package util;

import java.util.ArrayList;
import java.util.HashSet;

public class TestComparison {

	public static void main(String[] args) {
		
		ArrayList<DBAssociation> list = new ArrayList<DBAssociation>();
		list.add(new DBAssociation("PCLNT","PPF.GAP1","1-800#APP"));
		list.add(new DBAssociation("PCLNT","PPF.GAP1","1-800#APP"));
		list.add(new DBAssociation("PCLNT","PPF.GAPE","1-800#APP"));
		list.add(new DBAssociation("PDORS","PPF.GAP1","1-800#APP"));
		list.add(new DBAssociation("PDORS","PPF.GAP1","1-800#APP"));
				

		 //HashSet<DBAssociation> hashSet = new HashSet<DBAssociation>(list);      // create has set. Set will contains only unique objects 
		 ArrayList<DBAssociation> newlist = new ArrayList<DBAssociation>();
		
		
		for(DBAssociation Obj: list){
			
			if (!newlist.contains(Obj)){
				newlist.add(Obj);
				System.out.println( "true" );
			}
	    	
	    }
		 
		 System.out.println("Unique object List"); 
		 for (DBAssociation newObj : newlist) { 
			 System.out.println("/"+newObj.getDatabase() +"/"+newObj.getDatastore()+"/"); 
		 } 

	}
}
