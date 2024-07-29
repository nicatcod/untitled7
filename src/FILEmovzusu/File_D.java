package FILEmovzusu;

import java.io.*;

public class File_D {


    //Faylın adı numbers.txt olsun.
    //Fayla 1-dən 10-a qədər rəqəmləri yazın.
    //Fayldan rəqəmləri oxuyun və cəmləyin.

        public static void main(String[] args) {
            String fileName = "numbers.txt";

            // Fayla rəqəmləri yazmaq
            try (BufferedWriter yaz = new BufferedWriter(new FileWriter(fileName))) {
                //budrda ededleri dovre saliriq
                for (int i = 1; i <= 10; i++) {
                    yaz.write(i + "\n");
                }
                //burda ise xetani teyin edirik
            } catch (IOException e) {
            }
            int sum = 0;
            //Fayil oxuma hissesi
            try (BufferedReader oxu = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = oxu.readLine()) != null) {
                    sum += Integer.parseInt(line.trim());
                }
                System.out.println("Rəqəmlərin cəmi: " + sum);
            } catch (IOException e) {

            }
        }
    }