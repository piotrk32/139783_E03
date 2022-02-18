package E03_139783.z3;

import java.io.File;

public class FileList
{
    public static File[] FileListNoExtenction(String path)throws NullPointerException
    {
        File dir = new File(path);
        File[] files = dir.listFiles((loc) -> loc.isFile());

        try{
            for (File file : files)
            {
                if(file.getName().contains("."))
                {
                    System.out.println(file.getName().substring(0, file.getName().lastIndexOf('.')));
                }
                else
                {
                    System.out.println(file.getName());
                }

            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
        return files;
    }
}
