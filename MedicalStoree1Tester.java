class MedicalStoree1Tester{
public static void main(String store[]){
	
       MedicalStoree1.addMedicine("Acetaminophen");
	   MedicalStoree1.addMedicine("Dolo");
	   MedicalStoree1.addMedicine("Antibiotics");
	   MedicalStoree1.addMedicine("Cipla");
	   MedicalStoree1.addMedicine("Inhaler");
	   MedicalStoree1.addMedicine("Metformin");
	   MedicalStoree1.addMedicine("Cough Syrup");
	   MedicalStoree1.addMedicine("Glucose Syrup");
	   MedicalStoree1.addMedicine("Paracetamol");
	   MedicalStoree1.getAllMedicineAvailable();
	   
	   boolean isUpdated =  MedicalStoree1.updateMedicineName("Cough Syrup", "BComplex");
	   System.out.println("Is Medicine name updated " +isUpdated );
	   MedicalStoree1.getAllMedicineAvailable();

}

}