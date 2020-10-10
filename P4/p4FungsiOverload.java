public class p4FungsiOverload {
    public static void main(String[] args){
        
        int hasilInteger;
        hasilInteger = tambah(4, 5);
        printAngka(hasilInteger);
        
        float hasilFloat;
        hasilFloat = tambah(4.5f, 4);
        printAngka(hasilFloat);
        
        hasilInteger = tambah(11,12,13);
        printAngka(hasilInteger);
        
        printAngka(10);
        printAngka(10.5f);
        printAngka(16.7d);
        printAngka(16);
    }
    
    private static int tambah(int angkaInt1, int angkaInt2, int angkaInt3) {
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(float angkaFloat1, float angkaFloat2) {
        return angkaFloat1 + angkaFloat2;
    }
    
    private static int tambah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }
    
    private static void printAngka(double angkaDouble) {
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }
    
    private static void printAngka(float angkaFloat) {
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }
    
    private static void printAngka(int angkaInteger) {
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInteger);
    }
}
