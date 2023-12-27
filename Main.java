
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz...");
        String idmanlar="...Geçerli Hareketler...\n"
                +"1- Burpee\n"
                +"2-Pushup\n"
                +"3-Situp\n"
                +"4-Squat\n";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman programı oluşturun \n");
        
        System.out.print("Burpee Sayısı: ");
        int burpee=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pushup Sayısı: ");
        int pushup=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Situp Sayısı: ");
        int situp=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Squat Sayısı: ");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Idman idman=new Idman(burpee,pushup,situp,squat);
        System.out.println("Idmanınız başlıyor...");
        while(idman.idmanbittimi()==false)
        {
            System.out.println("Hareket türü(burpee,pushup,situp,squat)");
            String tur=scanner.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız: ");
            int kactane=scanner.nextInt();
            scanner.nextLine();
            idman.hareketyap(tur, kactane);
            
        }
        
        
    }
    
    
}
