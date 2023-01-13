package com.t3h.exceptionandfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFile {
    public void downloadFile(String link){
        try {
            int index = link.lastIndexOf("/")+1;
            String name = link.substring(index);
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            int total = conn.getContentLength();
            String typeFile = conn.getContentType();
            byte[] b = new byte[1024];

            OutputStream out = new FileOutputStream(name);

            InputStream in = conn.getInputStream();
            int le = in.read(b);
            int current = le;
            while (le > -1){
                out.write(b, 0, le);
                le = in.read(b);
                System.out.println("percent: " +(current * 100/total));
                current+=le;

            }

            in.close();
            out.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
