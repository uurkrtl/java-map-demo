package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medication medication1 = new Medication("Cymbalta", 10.25, true);
        Medication medication2 = new Medication("Lexapro", 8.50, true);
        Medication medication3 = new Medication("Lyrica", 3.45, false);
        Medication medication4 = new Medication("Sublocade", 18.55, true);
        Medication medication5 = new Medication("Amoxicillin", 22.35, false);
        Medication medication6 = new Medication("Ibuprofen", 7.65, true);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(medication1);
        pharmacy.save(medication2);
        pharmacy.save(medication3);
        pharmacy.save(medication4);
        pharmacy.save(medication5);
        pharmacy.save(medication6);

        System.out.println("Number of available medications: " + pharmacy.getCount());

        System.out.println("Medication found: " + pharmacy.find("Lexapro"));
        System.out.println("Medication found: " + pharmacy.find("Example"));

        pharmacy.delete("Lexapro");
        System.out.println("A medicine was deleted");
        System.out.println("After delete Number of available medications: " + pharmacy.getCount());

        pharmacy.printAll();
    }
}