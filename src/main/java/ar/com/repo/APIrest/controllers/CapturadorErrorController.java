package ar.com.repo.APIrest.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CapturadorErrorController implements ErrorController {
  private final static String PATH = "/error";
  @Override
  @RequestMapping(PATH)
  @ResponseBody
  public String getErrorPath() {
    // TODO Auto-generated method stub
    return "Error 404 Redireccione a ruta  /swagger-ui.html#/";
  }
}
