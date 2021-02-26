
public class Bus {
    
    //variable
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double average;
    public double penumpangBaru;
    
    //method non void
    public Bus(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //method void
    public void addpenumpang(double penumpang){
        this.penumpangBaru = 0;
        this.penumpangBaru = penumpang;
        double temp;
        temp = this.penumpang+penumpang;
        
        //percabangan
        if (temp > maxpenumpang){
            System.out.println("Penumpang Melebihi Kuota!");
        }
        else{
            this.penumpang=temp;
           
        }
    }
    //method void
    public void getpenumpang(int password){
        //percabangan
        if(password == 24){
            System.out.println("Password Benar!");
        }
        else{
            System.out.println("Password Salah!");
        }
    }
    
    //method nonvoid 
    public double getAverage(double berat){
        //percabangan
        if(this.penumpang+penumpangBaru>maxpenumpang){
            System.out.println("Berat Penumpang Bus = "+counter);
            System.out.println("Rata - rata Berat Penumpang Bus = "+average);
        }
        else{
            counter += berat*penumpangBaru;
            average = counter/penumpang;
            System.out.println("Berat Penumpang Bus = "+counter);
            System.out.println("Rata - rata Berat Penumpang Bus = "+average);
        }
        //pengembalian nilai berat
        return berat;
    
    }
    
    //method void
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimal Penumpang Yang Seharusnya Adalah = "+maxpenumpang);
    }
}
