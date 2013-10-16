import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 10/11/13
 * Time: 3:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Controller {

    public String address;

    public Controller(String address, String message) {

        int serverPort = 6666; // здесь обязательно нужно указать порт к которому привязывается сервер.
        //String address = this.address;
        //String address = "127.0.0.1"; // это IP-адрес компьютера, где исполняется наша серверная программа.
        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println(ipAddress);
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            //while (true) {
            //line = keyboard.readLine(); // ждем пока пользователь введет что-то и нажмет кнопку Enter.
            //out.writeUTF(line); // отсылаем введенную строку текста серверу.
            out.writeUTF(message);
            out.flush(); // заставляем поток закончить передачу данных.
            String srvAnswer = in.readUTF(); // ждем пока сервер отошлет строку текста.
            System.out.println("Looks like the server is pleased with us. Go ahead and enter more lines.");
            System.out.println(srvAnswer);
            // }
        } catch (Exception x) {
            x.printStackTrace();
        }

    }
}