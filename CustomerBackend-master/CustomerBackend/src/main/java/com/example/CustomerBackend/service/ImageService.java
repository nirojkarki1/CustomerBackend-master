package com.example.CustomerBackend.service;

import com.example.CustomerBackend.enitity.Imagedata;
import com.example.CustomerBackend.repository.ImageRepository;
import com.example.CustomerBackend.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public String uploadImage(MultipartFile file) throws IOException {
       Imagedata imageData = imageRepository.save(Imagedata.builder()
              .name(file.getOriginalFilename())
              .type(file.getContentType())
              .imageData(ImageUtils.compressImage(file.getBytes())).build());
      if (imageData != null ){
          return "File uploaded Sucessfully : " + file.getOriginalFilename();
      }

        return null;
    }

    public byte[] downloadImage( String fileName){
        Optional<Imagedata> dbImageData = imageRepository.findByName(fileName);
       byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());
       return images;

    }



}
