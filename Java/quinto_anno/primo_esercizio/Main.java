import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Inserisci l'URL del server: ");
            String serverURL = input.nextLine();
            System.out.print("Inserisci la risorsa da richiedere al server: ");
            String serverResource = input.nextLine();

            Socket client = new Socket(serverURL, 80);

            DataOutputStream outputServer = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
            BufferedReader inputServer = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String request = "GET " + serverResource + " HTTP/1.1" + "\n" + "Host: " + serverURL + "\n\n";

            outputServer.writeBytes(request);
            outputServer.flush();

            String linea;
            while((linea = inputServer.readLine()) != null){
                System.out.println(linea);
            }
            client.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}