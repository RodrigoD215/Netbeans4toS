/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static java.lang.System.out;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class inicioControlador {
    
    @RequestMapping("inicio.htm")
    public ModelAndView inicio(HttpServletRequest variable){
        ModelAndView modelovista= new ModelAndView();
        modelovista.setViewName("inicio");
        String num1=variable.getParameter("num1");
        String num2=variable.getParameter("num2");
        out.print(num1 + "dddd");
        modelovista.addObject("num1x",num1);
        modelovista.addObject("num2x",num2);
        return modelovista;
    }
     @RequestMapping("nosotros.htm")
       public ModelAndView nosotros(){
        ModelAndView modelovista= new ModelAndView();
        modelovista.setViewName("nosotros");
        return modelovista;
    }
       @RequestMapping("acercade.htm")
       public ModelAndView acercade(HttpServletRequest variable){
        ModelAndView modelovista= new ModelAndView();
        modelovista.setViewName("acercade");
        String nombre=variable.getParameter("nombre");
        String especialidad=variable.getParameter("especialidad");
        String semestre=variable.getParameter("semestre");
        String telefono=variable.getParameter("telefono");
        String hoby=variable.getParameter("hoby");
        modelovista.addObject("nombre",nombre);
        modelovista.addObject("especialidad",especialidad);
        modelovista.addObject("semestre",semestre);
        modelovista.addObject("telefono",telefono);
        modelovista.addObject("hoby",hoby);

        return modelovista;
    }
        @RequestMapping("operaciones.htm")
       public ModelAndView operaciones(HttpServletRequest variable){
        ModelAndView modelovista= new ModelAndView();
        modelovista.setViewName("operaciones");
        String num1=variable.getParameter("num1");
        String num2=variable.getParameter("num2");
        String ope= variable.getParameter("ope");
        int a=Integer.parseInt(num1);
        int b=Integer.parseInt(num2);
        int resultado=0;
        switch (ope) {
        case "por":
        resultado=a*b;
        break;
        case "entre":
          boolean esPrimo;
            int rInicial=2;//Rango inicial, este debe ser mayor de 1.
            int rFinal = 200;//Rango final.
         for(a = rInicial;a <= rFinal;a++){
  //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
         esPrimo=true;// i es primo hasta que se demuestre lo contrario, jejejejeje.
          for(b = 2;b < a;b++){
       //no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
       /*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
       por si mismo.*/
         if(a % b == 0){//Si además del 1 y el mismo hay otro divisor, ya no es primo.
         //% devuelve el residuo de i/j
          esPrimo = false;//se demostró que i no es primo.
       }
       }
       if(esPrimo){//Si es primo lo imprimo.
        System.out.println(a+"\n");
       }
  }
 }
        return modelovista;
    }
}
