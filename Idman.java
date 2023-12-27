
public class Idman {
    
    private int burpeesayisi;
    private int pushupsayisi;
    private int situpsayisi;
    private int squatsayisi;
    
    public Idman(int burpeesayisi,int pushupsayisi,int situpsayisi,int squatsayisi){
        this.burpeesayisi=burpeesayisi;
        this.pushupsayisi=pushupsayisi;
        this.situpsayisi=situpsayisi;
        this.squatsayisi=squatsayisi;
        
    }

    public int getBurpeesayisi() {
        return burpeesayisi;
    }

    public void setBurpeesayisi(int burpeesayisi) {
        this.burpeesayisi = burpeesayisi;
    }

    public int getPushupsayisi() {
        return pushupsayisi;
    }

    public void setPushupsayisi(int pushupsayisi) {
        this.pushupsayisi = pushupsayisi;
    }

    public int getSitupsayisi() {
        return situpsayisi;
    }

    public void setSitupsayisi(int situpsayisi) {
        this.situpsayisi = situpsayisi;
    }

    public int getSquatsayisi() {
        return squatsayisi;
    }

    public void setSquatsayisi(int squatsayisi) {
        this.squatsayisi = squatsayisi;
    }
    
    public void hareketyap(String hareketturu,int sayi)
    {
        if(hareketturu.equals("Burpee"))
        {
            burpeeyap(sayi);
        }
        else if(hareketturu.equals("Push Up"))
        {
            pushupyap(sayi);
        }
        else if(hareketturu.equals("Situp"))
        {
            situpyap(sayi);
        }
        else if(hareketturu.equals("Squat"))
        {
            squatyap(sayi);
        }
    }
    
    public void burpeeyap(int sayi)
    {
        if(burpeesayisi==0)
        {
            System.out.println("Yapacak burpee kalmadı...");
        }
        if(burpeesayisi-sayi<0)
        {
            System.out.println("Hedeflediğiniz burpeeyi geçtiniz tebrikler...");
            burpeesayisi=0;
            System.out.println("Kalan Burpee: "+burpeesayisi);
        }
        else
        {
            burpeesayisi-=sayi;
            System.out.println("Kalan Burpee: "+burpeesayisi);
        }
    }
    public void pushupyap(int sayi)
    {
        if(pushupsayisi==0)
        {
            System.out.println("Yapacak push up kalmadı...");
        }
        if(pushupsayisi-sayi<0)
        {
            System.out.println("Hedeflediğiniz push up geçtiniz tebrikler...");
            pushupsayisi=0;
            System.out.println("Kalan Push Up: "+pushupsayisi);
        }
        else
        {
            pushupsayisi-=sayi;
            System.out.println("Kalan Burpee: "+pushupsayisi);
        }
    }
    
    public void situpyap(int sayi)
    {
        if(situpsayisi==0)
        {
            System.out.println("Yapacak situp kalmadı...");
        }
        if(situpsayisi-sayi<0)
        {
            System.out.println("Hedeflediğiniz situpı geçtiniz tebrikler...");
            situpsayisi=0;
            System.out.println("Kalan Situp: "+situpsayisi);
        }
        else
        {
            situpsayisi-=sayi;
            System.out.println("Kalan Situp: "+situpsayisi);
        }
    }
    
    public void squatyap(int sayi)
    {
        if(squatsayisi==0)
        {
            System.out.println("Yapacak squat kalmadı...");
        }
        if(squatsayisi-sayi<0)
        {
            System.out.println("Hedeflediğiniz squatı geçtiniz tebrikler...");
            squatsayisi=0;
            System.out.println("Kalan Squat: "+squatsayisi);
        }
        else
        {
            squatsayisi-=sayi;
            System.out.println("Kalan Squat: "+squatsayisi);
        }
    }
    
    public boolean idmanbittimi()
    {
        return (pushupsayisi==0)&&(situpsayisi==0)&&(burpeesayisi==0)&&(squatsayisi==0);
    }
    
    
    
}
