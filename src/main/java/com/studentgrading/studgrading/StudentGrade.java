package com.studentgrading.studgrading;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class StudentGrade
{
    @RequestMapping("/")
    public String gradereport()
    {
        String gradeReport = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Student number");
        int studentNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter the Student name");
        String studentName = keyboard.nextLine();
        System.out.println("Enter the Student test score out of 50");
        int testScore = keyboard.nextInt();
        testScore = (testScore * 100)/50;
        if (testScore>=90 && testScore<=100)
        {
          gradeReport = studentNumber + "         " + studentName +  "        A";
        }
        else if(testScore>=80 && testScore<=89)
        {
            gradeReport = studentNumber + "          " + studentName +  "       B";
        }
        else if(testScore>=70 && testScore<=79)
        {
            gradeReport = studentNumber + "        " + studentName +  "        C";
        }
        else if(testScore>=60 && testScore<=99)
        {
            gradeReport = studentNumber +"          "+ studentName +  "          D";
        }
        else if(testScore>=0 && testScore<=59)
        {
            gradeReport = studentNumber + "       " + studentName +  "           F";
        }
        else
        {
            System.out.println("please enter a valid student score");
        }
        return  "Student grade report" +  "<br/>" +  gradeReport;

    }


}
