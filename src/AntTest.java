

import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: Andrey
 * Date: 24.04.14
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 */
public class AntTest {


    public static void Tests() throws InterruptedException {
        try {
            //String command = "C:\\Users\\vishalt\\Desktop\\New Source\\deliver\\vsmartpdf\\vsmartpdf.exe";
            //Runtime.getRuntime().exec("cmd /c "+command);
            //Process process = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\\vishalt\\Vsmartfinal\" && dir").start();

            String[] cmd = { "C:\\Users\\Andrey\\Documents\\GitHub\\TestProject\\StartupWatcher-2.01.428-Portable.exe"};
            Process p = Runtime.getRuntime().exec(cmd);
            System.out.println("Called");
            Thread.sleep(2000);
            p.destroy();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
