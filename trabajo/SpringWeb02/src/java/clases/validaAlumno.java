/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Juancarlos
 */
public abstract class validaAlumno implements Validator{
    
    @Override
    public boolean supports(Class <?> type){
        return Alumno.class.isAssignableFrom(type);
    }
    
    @Override
    public void validate(Object o, Errors errors){
        Alumno alumno=(Alumno)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"num1","required.num1","Campo num1 es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"num2","required.num2","Campo num2 es obligatorio");
        if(alumno.getNum2()==0){
            errors.rejectValue("num2", "num2.incorrect","Campo num2 no puede ser un texto");
            
        }
    }
    public validaAlumno(){
        
    }
}
