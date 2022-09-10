package com.paul.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    public String savePhoto(@RequestParam(name = "foto") MultipartFile file) throws IOException {

        byte[] bytes = file.getBytes();
        String encodedString = Base64.getEncoder().encodeToString(bytes);

        //creando el objeto.
        //Foto foto = new Foto(file.getOriginalFilename(), file.getContentType(),encodedString);

        //para redireccionar a otro endpoint
        //https://github.com/vacax/subir-almacenar-imagen-base64-springboot/blob/master/src/main/java/edu/pucmm/eict/sm64sb/controladores/AppController.java
        return "redirect:/listar";

    }
}
