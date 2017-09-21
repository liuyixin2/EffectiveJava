package io;

import java.io.FileInputStream;
import java.net.URL;
import java.util.zip.ZipInputStream;


/**
 * 注意的是：
 * AutoCloseable：JDK1.7中引入，为JDK1.7中引入的带资源的try语句提供了支持，try可以自动关闭资源。
 * AutoCloseable接口亦只定义了一个close()方法的定义：
 * void close() throws Exception;
 * 只有实现了AutoCloseable接口的类的对象才可以使用带资源的try语句进行管理。
 * 在JDK1.7中Closeable继承了AutoCloseable接口，所以IO包下的流类都可以使用带资源的try语句进行管理。
 */

/**
 * Created by Administrator on 2017\9\19 0019.
 * ZipConstants 这个接口定义了使用的常量处理ZIP文件的类。
 * InputStream 这个抽象类是代表字节输入流的所有类的超类。其中MAX_SKIP_BUFFER_SIZE这个静态常量定义了确定跳过时使用的最大缓冲区大小。
 * InflaterInputStream 这个类实现了一个流过滤器，用于在“压缩”压缩格式中对未压缩的数据进行过滤。它还被用作其他解压缩过滤器的基础，如GZIPInputStream。
 * 在InflaterInputStream中有Inflater这个类的引用。
 * Inflater 提供了对通用解压的支持
 */
public class ZipIo {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ZipIo.class.getClassLoader();
        URL resource = classLoader.getResource("FileIo.txt");
        String path = resource.getPath();
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        byte[] b= new byte[10];
        int len;
        while ((len = fileInputStream.read(b,0,b.length)) != -1){
            String string = new String(b,0,len);//由于是使用的是字节的形式读取的，所以会出现乱码的情况。
        }
    }
}
