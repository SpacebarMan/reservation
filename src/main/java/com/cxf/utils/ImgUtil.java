package com.cxf.utils;

import org.springframework.util.ResourceUtils;
import sun.misc.BASE64Encoder;

import java.io.*;

public class ImgUtil {

    public static String queryGetPhotoImageBlob(String address) {
        InputStream inputStream = null;
        byte[] data = null;
        try {
            File file = ResourceUtils.getFile("classpath:"+address);
            inputStream = new FileInputStream(file);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        return encoder.encode(data).replaceAll("\r|\n", "");
    }
}
