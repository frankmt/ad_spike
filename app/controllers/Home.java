package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Home extends Controller {

    private static Random generator = new Random(19580427);

    @Before
    static void createGenerator() {
        // generator = new Random(19580427);
    }

    public static void index() {      
        int randomIndex = generator.nextInt(3);
        String imageName = "image" + randomIndex;
        render(imageName);
    }

}