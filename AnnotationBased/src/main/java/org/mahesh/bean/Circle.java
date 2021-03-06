package org.mahesh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by maheshwar on 19-Jul-15.
 */
@Component
public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }


    //@Required
    /*@Autowired
    @Qualifier("circleReleated")*/
    @Resource(name = "center")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle..");
    }

    @PreDestroy
    public void destoryCircle() {
        System.out.println("Destroy of Circle..");
    }
    @Override
    public void draw() {
       System.out.println("Circle Point is : (" + center.getX() + ", " + center.getY() + ")" );
    }
}
