class MedicalStoree2{

static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int index;

//create Method
public static boolean addMedicine(String medicine){


//create or add operation
boolean isAdded=false;
if(medicine !=null){
	
	medicineNames[index]=medicine;
	index++;
	isAdded=true;	
}else{
	System.out.println("Cannot add medicine,as it indicates null value");	
}
return isAdded;
}
public static void getAllMedicineAvailable(){
	System.out.println("Invoking getAllmedicineAvailable");
	
	for(int medicine=0;medicine<medicineNames.length;medicine++){
		String reference=medicineNames[medicine];
	System.out.println("Accessing medicine  " + reference +"is at " + medicine);
	}
		System.out.println("End of getAllmedicineAvailable");
	}
	
	
	public static boolean updateMedicineName(String existingMedicineName , String updatedMedicineName){
		boolean isUpdated = false;
		for(int medicinesIndex=0; medicinesIndex < medicineNames.length; medicinesIndex++){
			if(medicineNames[medicinesIndex].equals(existingMedicineName)){
				medicineNames[medicinesIndex] = updatedMedicineName;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
	public static int deleteMedicineName(String deletedMedicineName){
		System.out.println("Invoking updateMedicineName");
		System.out.println("No of parameter : 3 , type of parameter : String , String");
		boolean isDeleted = false;
		int medicineIndex;
	    int noOfElements = medicineNames.length;
		for(medicineIndex=0; medicineIndex <medicineNames.length; medicineIndex++){
	    if(medicineNames[medicineIndex].equals(deletedMedicineName)){
	    break;
				
		}
		
	}
	if(medicineIndex<noOfElements){
		noOfElements = noOfElements -1;
		for(int newMedicineIndex= medicineIndex; newMedicineIndex<noOfElements;newMedicineIndex++){
			medicineNames[newMedicineIndex]=medicineNames[newMedicineIndex+1];
		}
	}
	return noOfElements;
	}
	
	public static void getAllMedicineNamePostDeletion(int newLength){
		for(int medicineIndex= 0; medicineIndex<newLength ; medicineIndex++){
			System.out.println(medicineNames[medicineIndex]);
		}
	}
}