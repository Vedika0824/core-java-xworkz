class StationaryTester{

public static void main (String tester[]){
Stationary.addStationaryItems("Books");
Stationary.addStationaryItems("Pencil");
Stationary.addStationaryItems("Pen");
Stationary.addStationaryItems("Markers");
Stationary.addStationaryItems("SketchPen");
Stationary.addStationaryItems("CampusBox");
Stationary.addStationaryItems("Eraser");
Stationary.addStationaryItems("Scale");

//read,get,fetch
Stationary.getAllStationaryItems();

//update,edit
Stationary.editStationaryItemsName("Cardboard sheets","CampusBox");

Stationary.getAllStationaryItems();
int newLength=Stationary.deleteStationaryItemName("SketchPen");
System.out.println("Calling getAllStationaryItemsPostDeletion");
Stationary.getAllStationaryItemsPostDeletion(newLength);
}
}