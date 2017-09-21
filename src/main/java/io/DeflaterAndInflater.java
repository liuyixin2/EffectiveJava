package io;

import java.io.*;
import java.util.zip.*;

/**
 * Created by Administrator on 2017\9\20 0020.
 *
 */
public class DeflaterAndInflater {
    public static void main(String[] args) throws Exception {
        // TODO 自动生成的方法存根
        //如果是在UNIX系统上，该值为'/',在microsoft windows系统上，为'\\'
        File file=new File("d:"+File.separator+"test.zip");  //定义要解压的文件
        File output=null;//文件
        ZipFile zipFile=new ZipFile(file); //得到解压文件
        //定义解压缩输入流
        ZipInputStream zipInput=new ZipInputStream(new FileInputStream(file));
        InputStream input=null;
        OutputStream out=null;
        ZipEntry entry=null;  //定义实体类
        while((entry=zipInput.getNextEntry())!=null){
            output=new File("d:"+File.separator+entry.getName());
            //判断输出文件夹是否存在，如果不存在，则创建文件夹
            if(!(output.getParentFile().exists())){
                output.getParentFile().mkdir();
            }
            //判断输出文件是否存在，如果不存在，则创建该文件
            if(!(output.exists())){
                output.createNewFile();
            }
            input=zipFile.getInputStream(entry);
            out=new FileOutputStream(output);
            int b=0;
            while((b=input.read())!=-1){
                out.write(b);
            }
            input.close();
            out.close();
        }
    }
}
