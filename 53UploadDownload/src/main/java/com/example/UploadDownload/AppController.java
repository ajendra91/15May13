package com.example.UploadDownload;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
public class AppController {

    public String picName=null;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam MultipartFile myfile) throws IOException{
          picName=myfile.getOriginalFilename();
          File file=new File("ajay/"+picName);
          FileOutputStream fos=new FileOutputStream(file);
          fos.write(myfile.getBytes());
          fos.close();

          /*FileInputStream fis =new FileInputStream(file);
        byte b1[]=new byte[50];
        fis.read(b1);
        String str1=new String(b1);
        System.out.println(str1);*/

         /* FileReader fr=new FileReader(file);
          BufferedReader br =new BufferedReader(fr);
          String s;
          while ((s=br.readLine())!=null){
              System.out.println(s);
          }*/



        return "successfully added";
    }

    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public ResponseEntity<Object> download() throws FileNotFoundException {
        File file=new File("ajay/"+picName);
        InputStreamResource isr= new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers=new HttpHeaders();

        headers.add("Content-Disposition", "attachment; filename="+file.getName());

        return ResponseEntity.ok().headers(headers).contentLength(
                file.length()).contentType(MediaType.parseMediaType("application/txt")).body(isr);

    }

}
