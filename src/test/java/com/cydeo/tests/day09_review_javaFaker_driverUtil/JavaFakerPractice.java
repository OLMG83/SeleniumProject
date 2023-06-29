package com.cydeo.tests.day09_review_javaFaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        //create a new object
        Faker faker= new Faker();

        // print out a random first name used faker
        System.out.println("faker.name().firstName()" + faker.name().firstName());


        //prin out a random last name used faker
        System.out.println("faker.name().lastName() "+faker.name().lastName());


        //print out a random full name used faker
        System.out.println("faker.name().fullName() "+faker.name().fullName());



        //print out a random City used faker
        System.out.println("faker.address().city()"+ faker.address().city());

        //print out a random street used faker
        System.out.println("faker.addressAddress().street()"+ faker.address().streetAddress());

        //print out a random zip code used faker
        System.out.println("faker.address().zipCode()"+ faker.address().zipCode());

        //print out a random full address used faker
        System.out.println("faker.address().fullAddress()"+ faker.address().fullAddress());

        //numerify() method is used for generate digits with specific formatting
        System.out.println("faker.numerify(\"###-###-###\") = " + faker.numerify("###-###-###"));

        // or  for credit card
        System.out.println("faker.numerify(\"####-####-####-####\") = " + faker.numerify("####-####-####-####"));

        //letterify() method used to generate leeters with specific formattting
        System.out.println("faker.letterify(\"????-????-????\") = " + faker.letterify("????-????-????"));


        // bothify() method used for both letters digits randomly
        System.out.println("faker.bothify(\"#?-#?#??-##??\") = " + faker.bothify("#?-#?#??-##??"));



        //chuckNorris() method is used to create chuckNorris fact
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.olena().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Olena"));

    }

}
