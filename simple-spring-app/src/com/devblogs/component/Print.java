package com.devblogs.component;
 
import com.devblogs.component.figure.Figure;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*; //Autowired;

@Component
public class Print {
	@Autowired
	@Qualifier("circle")
	
    private Figure figure;
 
    public Print() {
        System.out.println("Bean print is being created");
    }
 
    public void setFigure(Figure figure) {
        this.figure = figure;
    }
 
    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}
