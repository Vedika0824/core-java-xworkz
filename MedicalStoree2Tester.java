class MedicalStoree2Tester{
public static void main(String store[]){
	
       MedicalStoree2.addMedicine("Acetaminophen");
	   MedicalStoree2.addMedicine("Dolo");
	   MedicalStoree2.addMedicine("Antibiotics");
	   MedicalStoree2.addMedicine("Cipla");
	   MedicalStoree2.addMedicine("Inhaler");
	   MedicalStoree2.addMedicine("Metformin");
	   MedicalStoree2.addMedicine("Cough Syrup");
	   MedicalStoree2.addMedicine("Glucose Syrup");
	   MedicalStoree2.addMedicine("Paracetamol");
	   MedicalStoree2.getAllMedicineAvailable();
	   
	   boolean isUpdated =  MedicalStoree2.updateMedicineName("Cough Syrup", "BComplex");
	   System.out.println("Is Medicine name updated " +isUpdated );
	   MedicalStoree2.getAllMedicineAvailable();
		int newLength =	MedicalStoree2.deleteMedicineName("Inhaler");
			System.out.println("Calling getAllMedicineNamePostDeletion");
			MedicalStoree2.getAllMedicineNamePostDeletion(newLength);

}

}