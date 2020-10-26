package ru.vsu.cs.n4;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                double t1 = getValue("температура 1");
                double t2 = getValue("температура 2");
                double v1 = getValue("объём 1");
                double v2 = getValue("объём 2");

                double v = mixVolume(v1, v2);
                double t = mixTemp(t1, t2, v1, v2, v);

                printValue("объем смеси", v);
                printValue("температура смеси", t);
            }


            private static double mixVolume(double v1, double v2) {
                return (v1 + v2);
            }

            private static double mixTemp(double v1, double v2, double t1, double t2, double v) {
                return (((v1 * t1) + (v2 * t2)) / v);
            }

            private static double getValue(String NameOfValue) {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("%s = ", NameOfValue);
                return scanner.nextDouble();

            }

            private static void printValue(String name, double x) {
                System.out.printf("%s = %.1f%n", name, x);
            }

        }

