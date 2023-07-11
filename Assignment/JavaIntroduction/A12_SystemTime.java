package com.assigment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//Write a Java program to display the system time.
public class A12_SystemTime {
public static void main(String[] args) {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	System.out.println(dtf.format(now));
}
}
