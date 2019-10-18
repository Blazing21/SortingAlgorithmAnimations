import java.util.Arrays;
import java.util.Scanner;

public class NewClass {
    
    public static int[] bubble(int[] data,int n){
        System.out.println("");
        System.out.print("Data Sebelum di Sorting");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");
        
        System.out.println("");
        System.out.println("Proses Bubble Sort");
        for(int a = 0; a < n; a++)
        {
            System.out.println("Iterasi ke-"+(a+1)+" :");
            for(int b = 0; b < n; b++)
                System.out.print(data[b]+"  ");
             
            System.out.println("   Bandingkan "+data[0]+" dengan "+data[1]);
            for(int b = 0; b < n-1; b++)
            {
                String pesan = "   Tidak ada pertukaran";
                if(data[b] > data[b+1])
                {
                    pesan = "   Data "+data[b]+" ditukar dengan "+data[b+1];
                    int temp = data[b];        
                    data[b] = data[b+1];    
                    data[b+1] = temp;
                     
                }
             
                if(b < n-(a+1))
                {
                    for(int c = 0; c < n; c++)
                        System.out.print(data[c]+"  ");
                     
                    System.out.println(pesan);;
                }
            }
 
            System.out.println("\n");
        }
         
        System.out.print("Data Setelah di Sorting : ");
        for(int a = 0; a < n; a++)
            System.out.print(data[a]+"  ");
        return null;  
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("");
        System.out.print("Masukkan jumlah Data : ");    
        n = scan.nextInt();

        int[] data = new int[n];        
        System.out.println();
        for(int x = 0; x < n; x++)
        {
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");
        
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x < n-1; x++){
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");

            System.out.println("   Apakah Data "+data[x]+" sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < n; y++){
                if(min > data[y]){
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if(tukar == true){
                pesan = "   Data "+data[x]+" ditukar dengan Data "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");

            System.out.println(pesan+"\n");
        }

    System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");

    }
}
