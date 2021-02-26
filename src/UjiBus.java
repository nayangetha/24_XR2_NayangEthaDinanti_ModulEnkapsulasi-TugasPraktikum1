
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objek
        Bus Bus = new Bus(5);
        
        //input password
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        System.out.println("");
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(2); // tambah 2 penumpang
        Bus.cetakpenumpang();
        Bus.getAverage(40);
        System.out.println("");
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(1); //tambah 1 penumpang
        Bus.cetakpenumpang();
        Bus.getAverage(30);
        System.out.println("");
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        Bus.getAverage(20);
        System.out.println("");
        System.out.println("");
        
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        Bus.getAverage(10);
        
        
        
    }


}
